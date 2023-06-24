package com.geofahm.shahrdari.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtUtils {
    private final String SECERT = "mysecret";
    public String generateToken(String userName) {
        return Jwts.builder()
                .setSubject(userName)
                .setExpiration(new Date(System.currentTimeMillis()+(60*60*24*1000)))
                .signWith(SignatureAlgorithm.HS256,SECERT)
                .compact();
    }
    public String getUserName(String token) {
        return Jwts.parser().setSigningKey(SECERT).parseClaimsJws(token).getBody().getSubject();
    }
}
