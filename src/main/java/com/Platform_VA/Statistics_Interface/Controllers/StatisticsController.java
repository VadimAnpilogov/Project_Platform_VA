package com.Platform_VA.Statistics_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticsController {

    @GetMapping("/StatisticsPage")
    public String statisticsPage(){
        return "Statistics_Interface/statisticsPage";
    }
}
