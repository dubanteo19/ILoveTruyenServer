package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.dto.UserDTO;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
@Order(3)
public class UserLoader implements CommandLineRunner {
    private UserService userService;

    public UserLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        UserDTO user = new UserDTO("minh@gmail.com","password","Du Ban Teo");
        UserDTO user2 = new UserDTO("dubanteo2003@gmail.com","password","Du Ban Teo");
        userService.register(user);
        userService.register(user2);
    }
}
