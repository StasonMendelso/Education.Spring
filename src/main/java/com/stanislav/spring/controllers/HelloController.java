package com.stanislav.spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Stanislav Hlova
 */
@Controller
public class HelloController {
        @Value("${hello}")
        private String hello;
        @GetMapping("/hello")
        public String hello(){
            System.out.println(this.hello);
            return "hello";
        }
}
