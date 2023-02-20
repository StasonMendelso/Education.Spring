package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Stanislav Hlova
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
