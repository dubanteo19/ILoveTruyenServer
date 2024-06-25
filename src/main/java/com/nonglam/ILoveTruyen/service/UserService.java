package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.dto.UserDTO;
import com.nonglam.ILoveTruyen.exception.UserNotFoundException;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String email, String password) throws UserNotFoundException {
        if (!userRepository.existsByEmail(email))
            throw new UserNotFoundException("user not found");
        return userRepository.findByEmailEqualsAndPasswordEquals(email, password);
    }

    public User update(UserDTO user,Integer id) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty()) throw new UserNotFoundException("User not found");
        var existingUser = userOptional.get();
        existingUser.setFullName(user.fullName());
        existingUser.setPassword(user.password());
        return userRepository.save(existingUser);
    }

    public List<User> findAll() { return userRepository.findAll();
    }
    public User findById(Integer id) throws UserNotFoundException {
        var user = userRepository.findById(id);
        if(user.isEmpty()) throw new UserNotFoundException("User not found");
        return user.get();
    }
    public User register(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.email()))
            throw new IllegalStateException("user already exists");
        User user = new User();
        user.setFullName(userDTO.fullName());
        user.setEmail(userDTO.email());
        user.setPassword(userDTO.password());
        user.setComments(new ArrayList<>());
        return userRepository.save(user);
    }

}
