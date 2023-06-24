package com.geofahm.shahrdari.jwt;

import javax.validation.constraints.NotBlank;

public class JwtAuth {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JwtAuth() {
    }

    public JwtAuth(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
