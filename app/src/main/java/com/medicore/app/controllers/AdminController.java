package com.medicore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String showAdminMenu() {
        return "admin/adminMenu"; // Busca home.html en templates/
    }
    @GetMapping("/admin/registerEmployees")
    public String showRegisterEmployeesView() {
        return "admin/registerEmployees"; // Busca registerEmployees.html en templates/
    }

    @GetMapping("/admin/searchEmployees")
    public String showSearchEmployeesView() {
        return "admin/searchEmployees"; // Busca searchEmployees.html en templates/
    }

    @GetMapping("/admin/medicineStock")
    public String showMedicineStockView() {
        return "admin/medicineStock"; // Busca medicinesStock.html en templates/
    }
    @GetMapping("/admin/deleteUsers")
    public String showDeleteUsersView() {
        return "admin/deleteUsers"; // Busca deleteUsers.html en templates/
    }
}
