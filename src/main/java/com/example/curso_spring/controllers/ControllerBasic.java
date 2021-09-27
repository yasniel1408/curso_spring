package com.example.curso_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerBasic {

    @GetMapping(path = "/saludar")
    public String saludar() {
        return "index";
    }
}
