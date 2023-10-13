package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.security.userdetails.CustomUserDetails;
import com.celac.ecommerce.service.UserAuthenticatedService;
import java.util.Objects;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
* @author scelac
*/
@Service
public class UserAuthenticatedServiceImpl implements UserAuthenticatedService {
    @Override
    public CustomUserDetails getAuthenticatedUserFromSecurityContextHolder() {
        CustomUserDetails customUserDetails = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
             customUserDetails = (CustomUserDetails) authentication.getPrincipal();
        }

        return customUserDetails;
    }
}
