package com.Platform_VA.Development_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevelopmentController {

    @GetMapping("/DevelopmentPage")
    public String developmentPage(){
        return "Development_Interface/developmentPage";
    }
}
