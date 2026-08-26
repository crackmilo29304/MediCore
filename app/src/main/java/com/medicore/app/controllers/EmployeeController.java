package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping("/employee")
    public String showEmployeeMenu() {
        return "employee/employeeMenu"; // Busca home.html en templates/
    }

    @GetMapping("/employee/registerPatients")
    public String showRegisterPatientsView() {
        return "employee/registerPatients"; // Busca registerPatients.html en templates/
    }
    @GetMapping("/employee/searchPatients")
    public String showSearchPatientsView() {
        return "employee/searchPatients"; // Busca searchPatients.html en templates/
    }
    @GetMapping("/employee/createPrescriptions")
    public String showCreatePrescriptionView() {
        return "employee/createPrescriptions"; // Busca createPrescription.html en templates/
    }
}
