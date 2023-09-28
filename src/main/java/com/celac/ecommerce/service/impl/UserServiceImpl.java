package com.celac.ecommerce.service.impl;

import com.celac.ecommerce.dto.AddNewUserRequestDTO;
import com.celac.ecommerce.entity.User;
import com.celac.ecommerce.repository.UserRepository;
import com.celac.ecommerce.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author scelac
*/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(AddNewUserRequestDTO dto) {
        User newUser = new User();
        newUser.setFirstName(dto.getFirstName());
        newUser.setLastName(dto.getLastName());
        newUser.setPassword(dto.getPassword());
        newUser.setAccountNonLocked(false);
        newUser.setUserName(dto.getEmail());

        return userRepository.save(newUser);
    }
}
