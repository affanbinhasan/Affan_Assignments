package com.learning.springsecurity_jdbc_learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return("<h1> Hi There !</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return("<h1> Hello User </h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return("<h1> Hello Admin </h1>");
    }
}
