package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.EmailService;
import com.nonglam.ILoveTruyen.dto.UserDTO;
import com.nonglam.ILoveTruyen.emailService.EmailDetail;
import com.nonglam.ILoveTruyen.exception.UserNotFoundException;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService ) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public User login(String email, String password) throws UserNotFoundException {
        if (!userRepository.existsByEmail(email))
            throw new UserNotFoundException("user not found");
        return userRepository.findByEmailEqualsAndPasswordEquals(email, password);
    }

    public User update(UserDTO user, Integer id) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) throw new UserNotFoundException("User not found");
        var existingUser = userOptional.get();
        existingUser.setFullName(user.fullName());
        existingUser.setPassword(user.password());
        return userRepository.save(existingUser);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) throws UserNotFoundException {
        var user = userRepository.findById(id);
        if (user.isEmpty()) throw new UserNotFoundException("User not found");
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

    public String forgotPassword(String email) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) throw   new UserNotFoundException("email not found");
        var user = userOptional.get();
        Random r = new Random();
        String newPassword = String.valueOf(r.nextInt(10000, 99999));
        user.setPassword(newPassword);
        userRepository.save(user);
        EmailDetail emailDetail = new EmailDetail(email, "Cập nhập mật khẩu ",
                "Mật khẩu mới của bạn là " + newPassword);
        return emailService.sendSimpleEmail(emailDetail);
    }
}