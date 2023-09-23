package com.celac.ecommerce.service;

import com.celac.ecommerce.dto.LoginRequestDTO;

/**
 * @author scelac
 */
public interface AuthenticationService {
    String authenticate(LoginRequestDTO authenticationRequest);
}
