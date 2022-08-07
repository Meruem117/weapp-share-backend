package com.niit.share.service;

import org.springframework.security.core.Authentication;

public interface TokenService {
    String getToken(Authentication authentication);

    Boolean verifyToken(String token);
}
