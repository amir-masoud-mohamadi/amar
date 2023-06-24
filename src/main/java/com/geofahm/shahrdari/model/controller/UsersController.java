package com.geofahm.shahrdari.model.controller;


import com.geofahm.shahrdari.config.Backup;
import com.geofahm.shahrdari.jwt.JwtAuth;
import com.geofahm.shahrdari.jwt.JwtUtils;
import com.geofahm.shahrdari.model.entity.Users;
import com.geofahm.shahrdari.model.repository.UsersRepository;
import com.geofahm.shahrdari.model.service.RolesService;
import com.geofahm.shahrdari.model.service.UsersService;
import com.geofahm.shahrdari.response.*;
import com.github.eloyzone.jalalicalendar.DateConverter;
import com.github.eloyzone.jalalicalendar.JalaliDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@CrossOrigin(origins = "*", maxAge = 3600) @Controller
@RequestMapping("/jwt")
public class UsersController {
    @Autowired
    private RolesService rolesService;
    private final UsersService usersService;
    private final AuthenticationManager manager;
    private final JwtUtils jwtUtils;
    private final UsersRepository usersRepository;

    @Autowired
    public UsersController(UsersService usersService, AuthenticationManager manager, JwtUtils jwtUtils, UsersRepository usersRepository) {
        this.usersService = usersService;
        this.manager = manager;
        this.jwtUtils = jwtUtils;
        this.usersRepository = usersRepository;
    }


    @PostMapping("/set-password")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtSetPassword(@Valid @RequestBody PhoneModel phone, HttpServletResponse response, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        Users users = usersService.findByPhone(phone.getPhone());
        if (users == null) {
            responseModel.setResponseCode(-4);
            responseModel.setResponseMessage("کاربر با این شماره وجود ندارد");
            responseModel.setData(null);
        } else if (users.isValidate()) {
            Date dates = new Date();
            Long miliSecond = dates.getTime();

            if (miliSecond - users.getMiliSecond() > 240000) {
                responseModel.setResponseCode(-5);
                responseModel.setResponseMessage("اجازه تغییر پسورد وجود ندارد");
            } else {
                users.setPassword(phone.getPassword());
                usersRepository.setPassword(new BCryptPasswordEncoder().encode(users.getPassword()), phone.getPhone());
                responseModel.setResponseCode(200);
                responseModel.setResponseMessage("رمز عبور با موفقیت ثبت شد");

            }
        } else {
            responseModel.setResponseCode(-6);
            responseModel.setResponseMessage("کد پیامکی تایید نشده");
            responseModel.setData(null);
        }
        return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.OK);
    }

    @PostMapping("/verify")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtVerify(@Valid @RequestBody PhoneModel phone, HttpServletResponse response, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate date = LocalDate.now();
        DateConverter dateConverter = new DateConverter();
        JalaliDate jalaliDate = dateConverter.gregorianToJalali(date.getYear(), date.getMonth(), date.getDayOfMonth());
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);

        } else {
            try {
                Users users = usersRepository.findByPhone(phone.getPhone());
                if (users != null) {
                    if (users.getPassword().equals(phone.getCode())) {
                        Date dates = new Date();
                        Long miliSecond = dates.getTime();

                        if (miliSecond - users.getMiliSecond() > 120000) {

                            responseModel.setResponseCode(-5);
                            responseModel.setResponseMessage("انقضای کد تایید به پایان رسیده");

                        } else {

                            users.setValidate(true);
                            usersService.add(users,"verify");
                            responseModel.setResponseCode(200);
                            responseModel.setResponseMessage("احراز هویت با موفقیت انجام شد");
                            AuthLogin authLogin = new AuthLogin();

                            authLogin.setUserId(users.getId());
                            authLogin.setName(users.getName());

                            List list = new ArrayList();
                            list.add(authLogin);
                            responseModel.setData(list);
                        }


                    } else {
                        responseModel.setResponseCode(-3);
                        responseModel.setResponseMessage("کد تایید صحیح نمی باشد");
                    }
                } else {
                    responseModel.setResponseCode(-4);
                    responseModel.setResponseMessage("کاربر با این شماره وجود ندارد");
                }
            } catch (Exception e) {
                return new ResponseEntity<>(responseModel, HttpStatus.FORBIDDEN);

            }

            /*response.addHeader("Authorization", jwtUtils.generateToken(phone.getPhone()));*/
            return new ResponseEntity<>(responseModel, HttpStatus.OK);
        }

    }


    @PostMapping("/login")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtLogin(@Valid @RequestBody PhoneModel phone, HttpServletResponse response, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        Users users;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate date = LocalDate.now();
        DateConverter dateConverter = new DateConverter();
        JalaliDate jalaliDate = dateConverter.gregorianToJalali(date.getYear(), date.getMonth(), date.getDayOfMonth());
        if (bindingResult.hasErrors()) {

            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            try {
                users = usersRepository.findByPhone(phone.getPhone());
                manager.authenticate(new UsernamePasswordAuthenticationToken(users.getEmail(), phone.getPassword()));
                if (users.isValidate()) {
                    responseModel.setResponseCode(200);
                    responseModel.setResponseMessage("ورود با موفقیت انجام شد");
                    AuthLogin authLogin = new AuthLogin();
                    if (users.getRoles().get(0).getName().equals("admin")) {
                        authLogin.setAddress("admin");
                    } else {
                        authLogin.setAddress("user");
                    }
                    authLogin.setUserId(users.getId());
                    authLogin.setName(users.getName());
                    authLogin.setPhone(users.getEmail());
                    authLogin.setOrganizationName(users.getOrganizationName());
                    authLogin.setToken(jwtUtils.generateToken(users.getEmail()));
                    List list = new ArrayList();
                    list.add(authLogin);

                    responseModel.setData(list);
                } else {
                    responseModel.setResponseCode(-9);
                    responseModel.setResponseMessage("کد پیامکی تایید نشده");
                }
            } catch (Exception e) {
                return new ResponseEntity<>(responseModel, HttpStatus.FORBIDDEN);

            }
            response.addHeader("Authorization", jwtUtils.generateToken(users.getEmail()));
            return new ResponseEntity<>(responseModel, HttpStatus.OK);
        }

    }

    @GetMapping("/info2")
    public @ResponseBody
    Principal info(Principal principal) {

        return principal;
    }


    @PostMapping("/send-code")
    public @ResponseBody
    ResponseEntity<ResponseModel> verifyRegister(@Valid @RequestBody PhoneModel phoneModel, BindingResult bindingResult) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate date = LocalDate.now();
        DateConverter dateConverter = new DateConverter();
        JalaliDate jalaliDate = dateConverter.gregorianToJalali(date.getYear(), date.getMonth(), date.getDayOfMonth());
        ResponseModel responseModel = new ResponseModel();
        if (bindingResult.hasErrors()) {

            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            Users users = usersRepository.findByPhone(phoneModel.getPhone());
            if (users != null) {
                Date dates = new Date();
                Long miliSecond = dates.getTime();
                System.out.println(miliSecond);
                users.setMiliSecond(miliSecond);
                Random rand = new Random();

                int pass = Integer.parseInt(String.format("%04d", rand.nextInt(10000)));


                users.setPassword(String.valueOf(pass));
                usersService.add(users,"code");
                responseModel.setResponseCode(200);
                sendSms("https://api.sms.ir/v1/send/verify", users.getEmail(), users.getPassword());
                responseModel.setResponseMessage("کد تایید برای شما ارسال گردید");

                return new ResponseEntity<>(responseModel, HttpStatus.OK);
            } else {
                responseModel.setResponseCode(-2);
                responseModel.setResponseMessage("کاربر با این شماره وجود ندارد");
                return new ResponseEntity<>(responseModel, HttpStatus.OK);
            }


        }

    }


    @PostMapping("/register")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtRegister(@Valid @RequestBody Users users, HttpServletRequest httpServletRequest, BindingResult bindingResult) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate date = LocalDate.now();
        DateConverter dateConverter = new DateConverter();
        JalaliDate jalaliDate = dateConverter.gregorianToJalali(date.getYear(), date.getMonth(), date.getDayOfMonth());
        ResponseModel responseModel = new ResponseModel();
        Users userAuth = jwtDeatil(httpServletRequest).getBody();
        if (bindingResult.hasErrors()) {

            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
        } else {

            String jwt = httpServletRequest.getHeader("Authorization");
            String userName = jwtUtils.getUserName(jwt);
            Users admin = usersRepository.findByEmail(userName);
            // change here
            if (admin.getRoles().get(0).getName().equals("admin")) {
                if (usersRepository.findByPhone(users.getEmail()) == null) {

                    users.setValidate(false);
                    users.setPassword("test");
                    usersService.saveUser(users);
                    responseModel.setResponseCode(200);
                    //sendSms("https://api.sms.ir/v1/send/verify",users.getPhone(),users.getPassword());
                    responseModel.setResponseMessage("کاربر در سامانه ثبت شد");
                    return new ResponseEntity<>(responseModel, HttpStatus.OK);
                } else {
                    responseModel.setResponseCode(-2);
                    responseModel.setResponseMessage("کاربر با این شماره وجود دارد");
                    return new ResponseEntity<>(responseModel, HttpStatus.OK);
                }
            } else {
                return new ResponseEntity<>(responseModel, HttpStatus.FORBIDDEN);
            }


        }

    }


    @PostMapping("/register-admin")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtRegisterAdmin(@Valid @RequestBody Users users, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            responseModel = usersService.saveUserAdmin(users);
            return new ResponseEntity<>(responseModel, HttpStatus.OK);
        }

    }

    @GetMapping("/roles")
    public ResponseEntity save() {
        rolesService.save();
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/info")
    public ResponseEntity<Users> jwtDeatil(HttpServletRequest httpServletRequest) {
        String jwt = httpServletRequest.getHeader("Authorization");
        if (jwt != null) {
            String userName = jwtUtils.getUserName(jwt);
            if (userName != null) {
                Users users = (Users) usersService.loadUserByUsername(userName);

                return new ResponseEntity(users, HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.BAD_REQUEST);
            }

        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/edit")

    public @ResponseBody
    ResponseEntity<ResponseModel> editUser(@Valid @RequestBody EditUser users, HttpServletRequest httpServletRequest, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
        } else {

            String jwt = httpServletRequest.getHeader("Authorization");
            String userName = jwtUtils.getUserName(jwt);
            Users users1 = usersRepository.findByEmail(userName);

            users1.setName(users.getName());
            users1.setOrganizationName(users.getOrganizationName());
            users1.setPhone(users.getPhone());


            usersRepository.save(users1);
            List list = new ArrayList();
            list.add(users1);
            responseModel.setResponseCode(200);
            responseModel.setResponseMessage("ویرایش با موفقیت انجام شد");
            responseModel.setData(list);
            return new ResponseEntity<>(responseModel, HttpStatus.OK);

        }

    }

    @PostMapping("/admin-login")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtLoginAdmin(@Valid @RequestBody JwtAuth jwtAuth, HttpServletResponse response, BindingResult bindingResult) {
        ResponseModel responseModel = new ResponseModel();
        if (bindingResult.hasErrors()) {

            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            try {
                manager.authenticate(new UsernamePasswordAuthenticationToken(jwtAuth.getUserName(), jwtAuth.getPassword()));

                AuthLogin authLogin = new AuthLogin();
                Users users = usersRepository.findByEmail(jwtAuth.getUserName());
                if (users.getRoles().get(0).getId() == 1) {
                    responseModel.setResponseCode(200);
                    responseModel.setResponseMessage("ورود با موفقیت انجام شد");
                    authLogin.setUserId(users.getId());
                    authLogin.setName(users.getName());

                    List list = new ArrayList();
                    list.add(authLogin);
                    responseModel.setData(list);
                } else {
                    responseModel.setResponseCode(0);
                    responseModel.setResponseMessage("اجازه دسترسی داده نشده");
                    responseModel.setData(null);
                }

            } catch (Exception e) {

                return new ResponseEntity<>(responseModel, HttpStatus.FORBIDDEN);

            }
            response.addHeader("Authorization", jwtUtils.generateToken(jwtAuth.getUserName()));
            return new ResponseEntity<>(responseModel, HttpStatus.OK);
        }

    }

    @GetMapping("/detail-admin")
    public @ResponseBody
    ResponseEntity<ResponseModel> jwtDeatilAdmin(HttpServletRequest httpServletRequest) {
        ResponseModel responseModel = new ResponseModel();
        String jwt = httpServletRequest.getHeader("Authorization");
        if (jwt != null) {
            String userName = jwtUtils.getUserName(jwt);
            if (userName != null) {
                Users users = (Users) usersService.loadUserByUsername(userName);
                if (users.getRoles().get(0).getId() == 1) {
                    responseModel.setResponseCode(200);
                    responseModel.setResponseMessage("ورود با موفقیت انجام شد");
                    List list = new ArrayList();
                    list.add(users);
                    responseModel.setData(list);
                } else {
                    responseModel.setResponseCode(0);
                    responseModel.setResponseMessage("اجازه دسترسی داده نشده");
                    responseModel.setData(null);
                }
                return new ResponseEntity(responseModel, HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.BAD_REQUEST);
            }

        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }


    }

    public static void sendSms(String apiurl, String phone, String password) {
        try {
            URL url = new URL(apiurl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            Integer template = 180402;
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("X-API-KEY", "eynpsD6E1kicV8bjiVoRmUans2aBEpiemeQOenU4jaXpfuBh45VgDh6s8AVsbDJB");
            String payload = "{\"Mobile\":\"" + phone + "\",\"TemplateId\":" + template + ",\"parameters\":[{\"name\":\"PASSWORD\",\"value\" : \"" + password + "\"}]}";

            System.out.println(payload);
            byte[] out = payload.getBytes(StandardCharsets.UTF_8);
            OutputStream stream = connection.getOutputStream();

            stream.write(out);
            System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage()); // THis is optional
            connection.disconnect();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Failed successfully");
        }
    }

    @GetMapping("/getall")

    public ResponseEntity<ResponseModelProduct> get(HttpServletRequest httpServletRequest) {

        ResponseModelProduct responseModelProduct = new ResponseModelProduct();
        /*String jwt = httpServletRequest.getHeader("Authorization");
        String userName = jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        // change here
        if (admin.getRoles().get(0).getName().equals("admin")) {*/
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        org.springframework.data.domain.Pageable paging = PageRequest.of(0, 1000, Sort.by("name").ascending());
        responseModelProduct.setData(usersService.findAll(paging));
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);

        /*} else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }*/
    }


    @GetMapping("/search")

    public ResponseEntity<ResponseModelProduct> searchForCars(@RequestParam String search, @RequestParam int page, HttpServletRequest httpServletRequest) {
        String jwt = httpServletRequest.getHeader("Authorization");
        String userName = jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        // change here
        if (admin.getRoles().get(0).getName().equals("admin")) {
            org.springframework.data.domain.Pageable paging = PageRequest.of(page, 10, Sort.by("name").ascending());
            ResponseModelProduct responseModelProduct = new ResponseModelProduct();
            responseModelProduct.setResponseCode(200);
            responseModelProduct.setResponseMessage(null);
            responseModelProduct.setData(usersService.search(paging, search));
            return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }

    @GetMapping("/get")
    public ResponseEntity<ResponseModelProduct> get(@RequestParam int page, HttpServletRequest httpServletRequest) {
        ResponseModelProduct responseModelProduct = new ResponseModelProduct();
        String jwt = httpServletRequest.getHeader("Authorization");
        String userName = jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        // change here
        if (admin.getRoles().get(0).getName().equals("admin")) {
            org.springframework.data.domain.Pageable paging = PageRequest.of(page, 10, Sort.by("name").ascending());
            responseModelProduct.setResponseCode(200);
            responseModelProduct.setResponseMessage(null);
            System.out.println(paging);
            responseModelProduct.setData(usersService.findAll(paging));
            return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }


    @PostMapping("/delete")

    public ResponseEntity<ResponseModel> delete(@RequestBody EditUser phone,
                                                HttpServletRequest httpServletRequest,
                                                BindingResult bindingResult) {

        ResponseModel responseModel = new ResponseModel();
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            Users userDelete = usersRepository.findByPhone(phone.getPhone());
            String jwt = httpServletRequest.getHeader("Authorization");
            String userName = jwtUtils.getUserName(jwt);
            Users users1 = usersRepository.findByEmail(userName);
            if (users1.getRoles().get(0).getName().equals("admin")) {

                /*userEdit.setPhone(users.getPhone());*/
                LocalDate myObj = LocalDate.now();

                usersRepository.delete(userDelete);

                responseModel.setResponseCode(200);
                responseModel.setResponseMessage("حذف با موفقیت انجام شد");

                return new ResponseEntity<>(responseModel, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
        }
    }
}
