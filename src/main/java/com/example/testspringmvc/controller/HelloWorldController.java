package com.example.testspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView hello() {
        String message = "Hello World, Spring MVC!";
        return new ModelAndView("hello", "message", message);
    }
}