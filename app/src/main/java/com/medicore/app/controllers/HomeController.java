package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "public/rolSelection"; // Busca home.html en templates/
    }

    @GetMapping("/login")
    public String login() {
        return "public/login"; // Busca home.html en templates/
    }
}