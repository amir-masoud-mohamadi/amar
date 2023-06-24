package com.geofahm.shahrdari.config;


import com.geofahm.shahrdari.enums.Authority;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    DefaultRedirectStrategy defaultRedirectStrategy = new DefaultRedirectStrategy();
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        if (authentication.getAuthorities().contains(Authority.OP_ACCESS_ADMIN)) {
            defaultRedirectStrategy.sendRedirect(httpServletRequest,httpServletResponse, "/admin");
        } else if (authentication.getAuthorities().contains(Authority.OP_ACCESS_USER)) {
            defaultRedirectStrategy.sendRedirect(httpServletRequest,httpServletResponse, "/user");
        }
    }
}
