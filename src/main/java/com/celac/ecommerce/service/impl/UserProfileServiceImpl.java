package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.dto.UserProfileDTO;
import com.celac.ecommerce.entity.UserProfile;
import com.celac.ecommerce.repository.UserProfileRepository;
import com.celac.ecommerce.service.UserProfileService;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;
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

    @Override
    public void updateUserProfile(UserProfileDTO dto) {
        if (Objects.nonNull(dto.getUserId())){
            UserProfile userProfile = userProfileRepository.getUserProfileByUserId(dto.getUserId());
            userProfile.setFirstName(dto.getFirstName());
            userProfile.setLastName(dto.getLastName());
            userProfile.setImgPath(dto.getImgPath());
            userProfile.setAddress(dto.getAddress());
            userProfile.setPhoneNumber(dto.getPhoneNumber());
            userProfile.setUpdatedDateTime(LocalDateTime.now());
            userProfileRepository.save(userProfile);
        }

    }
}
