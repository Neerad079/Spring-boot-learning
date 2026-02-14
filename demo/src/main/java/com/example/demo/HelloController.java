package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @Value("${spring.application.name}") //The @Value annotation injects a value from your application's configuration files into the variable directly below it.
    private String appName;
    @RequestMapping("/")
    public String index(){
        System.out.println("appName : "+appName);
        return "index.html";
    }

}
