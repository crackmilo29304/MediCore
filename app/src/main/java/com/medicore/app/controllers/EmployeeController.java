package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/employee")
    public String showEmployeeMenu() {
        return "employee/employeeMenu"; // Busca home.html en templates/
    }
}
