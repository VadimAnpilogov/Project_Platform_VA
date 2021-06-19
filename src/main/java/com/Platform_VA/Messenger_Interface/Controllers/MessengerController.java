package com.Platform_VA.Messenger_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessengerController {

    @GetMapping("/MessengerPage")
    public String messengerPage(){
        return "Messenger_Interface/messengerPage";
    }
}
