package com.celac.ecommerce.service;

import com.celac.ecommerce.dto.UserProfileDTO;

/**
* @author scelac
*/
public interface UserProfileService {
    UserProfileDTO getUserProfileDTOByUserId(Long userId);

    void updateUserProfile(UserProfileDTO userProfileDTO);
}
