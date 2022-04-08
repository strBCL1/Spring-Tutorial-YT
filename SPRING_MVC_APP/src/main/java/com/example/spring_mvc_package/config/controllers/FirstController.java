package com.example.spring_mvc_package.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    /*@GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello, " + name + " " + surname);
        return "first/hello";
    }*/

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

//        System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a") double a,
                            @RequestParam(value = "b") double b,
                            @RequestParam(value = "action") String action,
                            Model model) {

        double value;

        // Unable to use enhanced switch since the project requires JDK 13+
        switch (action) {
            case "multiplication":
                value = a * b; break;

            case "addition":
                value = a + b; break;

            case "subtraction":
                value = a - b; break;

            case "division":
                value = a / b; break;

            default:
                value = 0; break;
        }

        model.addAttribute("result", value);
        return "/first/calculator";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
