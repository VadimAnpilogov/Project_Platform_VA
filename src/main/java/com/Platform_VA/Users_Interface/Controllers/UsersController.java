package com.Platform_VA.Users_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/UsersPage")
    public String usersPage(){
        return "Users_Interface/usersPage";
    }
}
