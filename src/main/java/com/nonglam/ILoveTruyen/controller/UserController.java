package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.dto.UserDTO;
import com.nonglam.ILoveTruyen.exception.UserNotFoundException;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) throws UserNotFoundException {
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDTO userDTO) {
        var user = userService.register(userDTO);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDTO userDTO) throws UserNotFoundException {
        var user = userService.login(userDTO.email(), userDTO.password());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Integer id,
                                       @RequestBody UserDTO user) throws UserNotFoundException {
        var updatedUser = userService.update(user,id);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }
}
