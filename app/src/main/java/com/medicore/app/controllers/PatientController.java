package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {
    @GetMapping("/patient")
    public String showPatientMenu() {
        return "patient/patientMenu"; // Busca home.html en templates/
    }
    @GetMapping("/patient/updatePersonalData")
    public String showUpdatePersonalDataView() {
        return "patient/updatePersonalData"; // Busca updatePersonalData.html en templates/
    }
    @GetMapping("/patient/activePrescriptions")
    public String showActivePrescriptionsView() {
        return "patient/activePrescriptions"; // Busca activePrescriptions.html en templates/
    }
    
    @GetMapping("/patient/pqrs")
    public String showPQRSView() {
        return "patient/pqrs"; // Busca pqrs.html en templates/
    }
    @GetMapping("/patient/branches")
    public String showBranchesView() {
        return "patient/branches"; // Busca branches.html en templates/
    }
    @GetMapping("/patient/appointments/schedule")
    public String showScheduleView() {
        return "patient/appointments/schedule"; // Busca schedule.html en templates/
    }
    @GetMapping("/patient/appointments/cancel")
    public String showCancelView() {
        return "patient/appointments/cancel"; // Busca cancel.html en templates/
    }
}
