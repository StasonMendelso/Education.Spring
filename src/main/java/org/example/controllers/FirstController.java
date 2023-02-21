package org.example.controllers;

import org.example.calculator.CalculatorAction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stanislav Hlova
 */
@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam("surname") String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname + "!");

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam("a") int a,
                            @RequestParam("b") int b,
                            @RequestParam("action") String action,
                            Model model) {

        double result = 0;
        CalculatorAction calculatorAction = CalculatorAction.getInstance(action);
        if (calculatorAction == null) {
            model.addAttribute("result", result);
            return "first/calculator";
        }
        result = switch (calculatorAction) {
            case MULTIPLICATION -> a * b;
            case DIVISION -> a / (double) b;
            case ADDITION -> a + b;
            case SUBTRACTION -> a - b;
        };

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
