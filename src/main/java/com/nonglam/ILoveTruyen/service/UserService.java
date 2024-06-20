package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.dto.UserDTO;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User login(String email, String password){
        if(!userRepository.existsByEmail(email))
            throw new IllegalStateException("user not found");
        return userRepository.findByEmailEqualsAndPasswordEquals(email,password);
    }
    public User update(User user){
        return userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User register(UserDTO userDTO){
        User user = new User();
        user.setFullName(userDTO.fullName());
        user.setEmail(userDTO.email());
        user.setPassword(userDTO.password());
        user.setComments(new ArrayList<>());
        return userRepository.save(user);
    }

}
