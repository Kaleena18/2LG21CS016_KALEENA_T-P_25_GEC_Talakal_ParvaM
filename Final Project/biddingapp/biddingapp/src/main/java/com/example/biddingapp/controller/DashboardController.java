package com.example.biddingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String getDashboardPage() {
        return "dashboard"; // This resolves to dashboard.html in /static or /public
    }
}
