package com.geofahm.shahrdari.model.service;


import com.geofahm.shahrdari.model.entity.Roles;
import com.geofahm.shahrdari.model.entity.Users;
import com.geofahm.shahrdari.model.repository.RolesRepository;
import com.geofahm.shahrdari.model.repository.UsersRepository;
import com.geofahm.shahrdari.response.ResponseModel;
import com.geofahm.shahrdari.response.SearchCriteria;
import com.geofahm.shahrdari.response.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService implements UserDetailsService {
    private final RolesRepository rolesRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository, RolesRepository rolesRepository) {
        this.usersRepository = usersRepository;
        this.rolesRepository = rolesRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usersRepository.findByEmail(email);
    }

    public ResponseModel saveUser(Users users) {
        Users test = usersRepository.findByEmail(users.getEmail());
        List list = new ArrayList();

        ResponseModel responseModel = new ResponseModel();

        if (test == null) {
            List roles = new ArrayList();
            Roles roles1 = rolesRepository.findByName("user");
            roles.add(roles1);

            users.setPassword(new BCryptPasswordEncoder().encode(users.getPassword()));
            responseModel.setResponseCode(200);
            responseModel.setResponseMessage("ثبت نام با موفقیت انجام شد");
            users.setRoles(roles);
            test = usersRepository.save(users);
            list.add(test);

        } else {
            responseModel.setResponseCode(0);
            responseModel.setResponseMessage("کاربر با این ایمیل ثبت شده است");
            list.add(test);
        }
        responseModel.setData(list);
        return responseModel;
    }

    public ResponseModel saveUserAdmin(Users users) {
        Users test = usersRepository.findByEmail(users.getEmail());
        List list = new ArrayList();

        ResponseModel responseModel = new ResponseModel();
        if (test == null) {
            List roles = new ArrayList();
            Roles roles1 = rolesRepository.findByName("admin");
            roles.add(roles1);
            LocalDate myObj = LocalDate.now();
            users.setPassword(new BCryptPasswordEncoder().encode(users.getPassword()));
            responseModel.setResponseCode(200);
            responseModel.setResponseMessage("ثبت نام با موفقیت انجام شد");
            users.setRoles(roles);
            test = usersRepository.save(users);
            list.add(test);

        } else {
            responseModel.setResponseCode(0);
            responseModel.setResponseMessage("کاربر با این ایمیل ثبت شده است");
            list.add(test);
        }
        responseModel.setData(list);
        return responseModel;

    }

    public Users findByPhone(String phone) {
        return usersRepository.findByPhone(phone);
    }

    public Page<Users> findAll(Pageable pageable) {
        return usersRepository.findAll(pageable);
    }

    public List<Users> findAll(Sort sort) {
        return usersRepository.findAll();
    }

    public Page<Users> search(Pageable pageable, String search) {
        UserSpecification spec =
                new UserSpecification(new SearchCriteria("name", ":", search));
        return usersRepository.findAll(spec, pageable);

    }


    public ResponseModel add(Users users,String type) {

        List list = new ArrayList();
        ResponseModel responseModel = new ResponseModel();

        Users update = usersRepository.findById(users.getId()).get();
        if (type == "code") {
            update.setPassword(users.getPassword());
        }else if (type.equals("verify")){
            update.setValidate(true);
        }
        usersRepository.save(update);
        responseModel.setResponseCode(200);
        responseModel.setResponseMessage("ثبت نام با موفقیت انجام شد");
        responseModel.setData(list);
        return responseModel;
    }
}
