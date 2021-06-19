package com.Platform_VA.Personal_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonalController {

    @GetMapping("/PersonalPage")
    public String personalPage(){
        return "Personal_Interface/personalPage";
    }
}
