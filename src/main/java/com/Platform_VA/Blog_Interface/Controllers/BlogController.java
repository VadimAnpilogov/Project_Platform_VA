package com.Platform_VA.Blog_Interface.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/BlogPage")
    public String blogPage(){
        return "Blog_Interface/blogPage";
    }

    @GetMapping("/BlogCreatePage")
    public String blogCreatePage(){
        return "Blog_Interface/blogCreatePage";
    }
}
