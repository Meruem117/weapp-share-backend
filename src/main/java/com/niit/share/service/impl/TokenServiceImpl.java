package com.niit.share.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.niit.share.service.TokenService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenServiceImpl implements TokenService {
    private Algorithm getAlgorithm() {
        return Algorithm.HMAC256("secret");
    }

    @Override
    public String getToken(Authentication authentication) {
        Date date = new Date(System.currentTimeMillis() + 1800000);
        String token = JWT.create()
                .withExpiresAt(date)
                .withClaim("username", authentication.getName())
                .sign(this.getAlgorithm());
        return token;
    }

    @Override
    public Boolean verifyToken(String token) {
        try {
            JWTVerifier jwtVerifier = JWT.require(this.getAlgorithm()).build();
            jwtVerifier.verify(token);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }
}
