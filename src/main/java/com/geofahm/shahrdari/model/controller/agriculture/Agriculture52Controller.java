package com.geofahm.shahrdari.model.controller.agriculture;

import com.geofahm.shahrdari.jwt.JwtUtils;
import com.geofahm.shahrdari.model.entity.Users;
import com.geofahm.shahrdari.model.entity.education.Education;

import com.geofahm.shahrdari.model.entity.farm.Agriculture52;
import com.geofahm.shahrdari.model.repository.UsersRepository;
import com.geofahm.shahrdari.model.service.agriculture.Agriculture52Service;

import com.geofahm.shahrdari.response.CityModel;
import com.geofahm.shahrdari.response.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600) @Controller
@RequestMapping("/agriculture52")
public class Agriculture52Controller {
    private final Agriculture52Service service;
    private final JwtUtils jwtUtils;

    private final UsersRepository usersRepository;

    @Autowired
    public Agriculture52Controller(Agriculture52Service service, JwtUtils jwtUtils, UsersRepository usersRepository) {
        this.service = service;
        this.jwtUtils = jwtUtils;

        this.usersRepository = usersRepository;
    }


    @GetMapping("/getall")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> get() {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        responseModelProduct.setData(service.getAll());
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }




    @GetMapping("/get-one")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> getOne(@RequestParam("id") Long id) {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        List list = new ArrayList();
        list.add(service.findById(id));
        responseModelProduct.setData(list);
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }


    @GetMapping("/get-by-year")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> getByYear(@RequestParam("year") String year) {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        responseModelProduct.setData(service.getByYear(year));
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }

    @GetMapping("/get-year")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> getYear() {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        responseModelProduct.setData(service.getYear());
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }

    @PostMapping("/get-by-city")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> getByCity(@RequestBody() CityModel city) {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        responseModelProduct.setData(service.getByCity(city.getCity()));
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }

    @GetMapping("/get-city")
    @PreAuthorize("hasAuthority('OP_ACCESS_USER')")
    public ResponseEntity<ResponseModel> getCity() {

        ResponseModel responseModelProduct = new ResponseModel();
        responseModelProduct.setResponseCode(200);
        responseModelProduct.setResponseMessage(null);
        responseModelProduct.setData(service.getCity());
        return new ResponseEntity<>(responseModelProduct, HttpStatus.OK);
    }
    @PostMapping("/add")
    //@PreAuthorize("hasAuthority('OP_ACCESS_ADMIN')")
    public ResponseEntity<ResponseModel> add(@Valid @RequestBody Agriculture52 edit, HttpServletRequest httpServletRequest) {
        String jwt = httpServletRequest.getHeader("Authorization");
        String userName=jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        if (admin.getRoles().get(0).getName().equals("admin")) {
            Agriculture52 edit2 = service.save(edit);
            List list2 = new ArrayList();
            list2.add(edit2);
            ResponseModel responseModel2 = new ResponseModel();
            responseModel2.setData(list2);
            responseModel2.setResponseCode(200);
            responseModel2.setResponseMessage("با موفقیت افزوده شد");
            return new ResponseEntity<>(responseModel2,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }



    }





    @PostMapping("/delete")
    //@PreAuthorize("hasAuthority('OP_ACCESS_ADMIN')")
    public ResponseEntity<ResponseModel> delete(@Valid @RequestBody Education edit,HttpServletRequest httpServletRequest) {

        String jwt = httpServletRequest.getHeader("Authorization");
        String userName=jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        if (admin.getRoles().get(0).getName().equals("admin")) {

            Agriculture52 studentUni = service.findById(edit.getId());
            System.out.println(service.getYear());
            if (studentUni != null) {

                service.delete(edit.getId());

                ResponseModel responseModel2 = new ResponseModel();

                responseModel2.setResponseCode(200);
                responseModel2.setResponseMessage(" حذف با موفقیت انجام شد");
                return new ResponseEntity<>(responseModel2, HttpStatus.OK);
            } else {

                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

        }else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }


    @PostMapping("/edit")
    //@PreAuthorize("hasAuthority('OP_ACCESS_ADMIN')")
    public ResponseEntity<ResponseModel> edit(@Valid @RequestBody Agriculture52 edit, HttpServletRequest httpServletRequest) {

        String jwt = httpServletRequest.getHeader("Authorization");
        String userName=jwtUtils.getUserName(jwt);
        Users admin = usersRepository.findByEmail(userName);
        if (admin.getRoles().get(0).getName().equals("admin")) {

            Agriculture52 studentUni = service.findById(edit.getId());
            if (studentUni != null) {

                Agriculture52 edit2 = service.edit(edit);
                List list2 = new ArrayList();
                list2.add(edit2);
                ResponseModel responseModel2 = new ResponseModel();
                responseModel2.setData(list2);
                responseModel2.setResponseCode(200);
                responseModel2.setResponseMessage(" ویرایش با موفقیت انجام شد");
                return new ResponseEntity<>(responseModel2, HttpStatus.OK);
            } else {

                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }


    }

}