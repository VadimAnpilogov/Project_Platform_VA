package com.Platform_VA.Main_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String hello(){
        return "Main_Interface/hello";
    }
}
