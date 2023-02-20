package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Stanislav Hlova
 */
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}
