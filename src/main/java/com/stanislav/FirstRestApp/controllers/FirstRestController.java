package com.stanislav.FirstRestApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stanislav Hlova
 */
@RestController
@RequestMapping("/api")
public class FirstRestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello world!";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}

