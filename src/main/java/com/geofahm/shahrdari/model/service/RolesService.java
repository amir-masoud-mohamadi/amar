package com.geofahm.shahrdari.model.service;
import com.geofahm.shahrdari.enums.Authority;
import com.geofahm.shahrdari.model.entity.Roles;
import com.geofahm.shahrdari.model.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;

    @Autowired
    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public void save() {
        List<Authority> authorities = new ArrayList<>();
        List<Authority> authorities1 = new ArrayList<>();
        Roles roles = new Roles();
        Roles roles1 = new Roles();
        authorities.add(Authority.OP_ACCESS_ADMIN);
        roles.setName("admin");
        roles.setAuthorities(authorities);
        authorities1.add(Authority.OP_ACCESS_USER);
        roles1.setName("user");
        roles1.setAuthorities(authorities1);
        rolesRepository.save(roles);
        rolesRepository.save(roles1);
    }
}
