package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.dto.AddNewUserRequestDTO;
import com.celac.ecommerce.entity.User;
import com.celac.ecommerce.entity.UserProfile;
import com.celac.ecommerce.entity.UserRole;
import com.celac.ecommerce.entity.enums.RoleName;
import com.celac.ecommerce.repository.UserProfileRepository;
import com.celac.ecommerce.repository.UserRepository;
import com.celac.ecommerce.repository.UserRoleRepository;
import com.celac.ecommerce.service.UserService;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
* @author scelac
*/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserProfileRepository userProfileRepository;

    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.userProfileRepository = userProfileRepository;
    }

    @Override
    @Transactional
    public User saveUser(AddNewUserRequestDTO dto) {
        if (userRepository.exitUserByUsername(dto.getEmail())){
           return null;
        }
        UserProfile userProfile = new UserProfile();
        userProfile.setFirstName(dto.getFirstName());
        userProfile.setLastName(dto.getLastName());
        userProfile = userProfileRepository.save(userProfile);
        User newUser = new User();
        newUser.setUserProfile(userProfile);
        newUser.setAccountNonLocked(false);
        newUser.setUserName(dto.getEmail());
        newUser.setCreatedDateTime(LocalDateTime.now());
        newUser.setPassword(passwordEncoder.encode(dto.getPassword()));

        newUser = userRepository.save(newUser);
        UserRole guest = new UserRole();
        guest.setRoleName(RoleName.GUEST);
        guest.setUser(newUser);
        guest =  userRoleRepository.save(guest);
        newUser.getRoles().add(guest);
        return newUser;
    }
}
