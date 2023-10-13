package com.celac.ecommerce.service;

import com.celac.ecommerce.security.userdetails.CustomUserDetails;

/**
* @author scelac
*/
public interface UserAuthenticatedService {

    CustomUserDetails getAuthenticatedUserFromSecurityContextHolder();
}
