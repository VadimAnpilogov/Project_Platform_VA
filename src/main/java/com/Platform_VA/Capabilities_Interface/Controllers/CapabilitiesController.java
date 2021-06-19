package com.Platform_VA.Capabilities_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapabilitiesController {

    @GetMapping("/CapabilitiesPage")
    public String capabilitiesPage(){
        return "Capabilities_Interface/capabilitiesPage";
    }
}
