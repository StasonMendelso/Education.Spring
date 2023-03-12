package com.stanislav.spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Stanislav Hlova
 */
@Controller
public class HelloController {
        @GetMapping("/hello")
        public String hello(){
            return "hello";
        }
}
