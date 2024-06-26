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
        UserDTO user1 = new UserDTO("minh@gmail.com", "password", "Du Ban Teo");
        UserDTO user2 = new UserDTO("dubanteo2003@gmail.com", "password", "Dư Thành Minh");
        UserDTO user3 = new UserDTO("ngan@gmail.com", "password", "Nguyễn Thị Chúc Ngân");
        UserDTO user4 = new UserDTO("quynh@gmail.com", "password", "Liêu Thị Diễm Quỳnh");
        UserDTO user5 = new UserDTO("phuong@gmail.com", "password", "Lại Thị Bích Phương");
        
        UserDTO user6 = new UserDTO("anh@gmail.com", "password", "Nguyen Van Anh");
        UserDTO user7 = new UserDTO("bao@gmail.com", "password", "Tran Thi Bao");
        UserDTO user8 = new UserDTO("binh@gmail.com", "password", "Le Van Binh");
        UserDTO user9 = new UserDTO("chi@gmail.com", "password", "Hoang Thi Chi");
        UserDTO user10 = new UserDTO("duong@gmail.com", "password", "Pham Van Duong");

        // Registering users
        userService.register(user1);
        userService.register(user2);
        userService.register(user3);
        userService.register(user4);
        userService.register(user5);
        userService.register(user6);
        userService.register(user7);
        userService.register(user8);
        userService.register(user9);
        userService.register(user10);
    }
}
