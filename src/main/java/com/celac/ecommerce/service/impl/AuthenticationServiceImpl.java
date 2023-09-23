package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.dto.LoginRequestDTO;
import com.celac.ecommerce.service.AuthenticationService;
import org.springframework.stereotype.Service;

/**
 * @author scelac
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public String authenticate(LoginRequestDTO authenticationRequest) {
        return "Success";
    }
}
