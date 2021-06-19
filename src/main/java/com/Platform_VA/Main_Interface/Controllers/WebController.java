package com.Platform_VA.Main_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String hello(){
        return "Main_Interface/hello";
    }

    @GetMapping("/login")
    public String login() {
        return "Main_Interface/login";
    }
    @GetMapping("/admin")
    public String admin() {
        return "Admin_Interface/adminPage";
    }
}
