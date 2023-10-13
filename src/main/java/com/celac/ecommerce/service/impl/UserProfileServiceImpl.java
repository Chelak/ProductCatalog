package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.dto.UserProfileDTO;
import com.celac.ecommerce.repository.UserProfileRepository;
import com.celac.ecommerce.service.UserProfileService;
import org.springframework.stereotype.Service;

/**
* @author scelac
*/
@Service
public class UserProfileServiceImpl implements UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public UserProfileServiceImpl(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    public UserProfileDTO getUserProfileDTOByUserId(Long userId) {

        return userProfileRepository.UserProfileDTOByUserId(userId);
    }
}
