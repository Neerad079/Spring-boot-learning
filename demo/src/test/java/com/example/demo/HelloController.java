package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// "Annotation" , this class should be used as
              //a web app for receiving web traffic
@RequestMapping("/")
public class HelloController {
    public String index(){
        return "index.html";
    }
}
