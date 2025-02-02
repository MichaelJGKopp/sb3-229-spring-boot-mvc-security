package com.luv2code.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }

}
