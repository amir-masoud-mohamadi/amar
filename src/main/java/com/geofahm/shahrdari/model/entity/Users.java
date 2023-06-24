package com.geofahm.shahrdari.model.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.geofahm.shahrdari.enums.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.*;

@Entity
public class Users implements Serializable,UserDetails,OAuth2User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @NotEmpty
    @Column(unique = true)
    private String email;
    private String password;
    @NotNull
    @NotEmpty
    private String name;

    /*@ManyToOne
    @JoinColumn(referencedColumnName = "name")*/
    private String organizationName;
    private String jobPosition;

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @NotNull
    @NotEmpty
    private String phone;

    private boolean validate;

    private Long miliSecond;




    public String getPhone() {
        return phone;
    }
    public boolean isValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getMiliSecond() {
        return miliSecond;
    }

    public void setMiliSecond(Long miliSecond) {
        this.miliSecond = miliSecond;
    }

    /*public OrganizationName getOrganizationName() {
        return organiz;
    }

    public void setOrganizationName(OrganizationName organizationName) {
        this.organiz = organizationName;
    }*/

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Boolean enabled = true;
    /*@ElementCollection(targetClass = UserRoles.class)
    @CollectionTable(name = "authorities",joinColumns = @JoinColumn(name = "email",referencedColumnName = "email"))
    @Enumerated(EnumType.STRING)
    private List<UserRoles> userRoles;*/
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Roles> roles;
    public Users() {
    }

    public Users(String email, String password, Boolean enabled, List<Roles> roles) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }



    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public Map<String, Object> getAttributes() {
        return new HashMap<>();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities= new ArrayList<>();
        if (roles != null && roles.isEmpty()) {
            for (Roles r : roles
                    ) {
                grantedAuthorities.addAll(r.getAuthorities());
            }
        } else {
            grantedAuthorities.add(Authority.OP_ACCESS_USER);
        }
        return grantedAuthorities;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
