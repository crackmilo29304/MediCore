package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.medicore.app.utils.UserSession;

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

    @PostMapping("/set-role")
    public String setUsserSession(@RequestParam String role) {
        UserSession.setRole(role);
        System.out.println("Rol seleccionado: " + UserSession.getRole());
        return("redirect:/login");
    }
}