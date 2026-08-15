package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    @GetMapping("/patient")
    public String showPatientMenu() {
        return "patient/patientMenu"; // Busca home.html en templates/
    }
}
