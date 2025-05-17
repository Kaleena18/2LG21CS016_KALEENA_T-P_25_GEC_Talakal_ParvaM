package com.example.biddingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String showLoginForm() {
        return "admin"; // Thymeleaf or static resources should map to admin.html
    }

    @PostMapping("/admin")
    public String handleLogin(
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        @RequestParam("email") String email,
        Model model
    ) {
        // Dummy authentication logic — replace with your actual validation
        if ("admin".equals(username) && "password".equals(password)) {
            model.addAttribute("message", "Login successful");
            return "dashboard"; // You should have dashboard.html or corresponding view
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "admin"; // Return to login page with error
        }
    }
}
