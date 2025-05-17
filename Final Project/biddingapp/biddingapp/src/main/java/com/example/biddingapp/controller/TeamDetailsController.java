package com.example.biddingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TeamDetailsController {

    // Serve the team details page
    @GetMapping("/teamdetails")
    public String getTeamDetailsPage() {
        return "teamdetails"; // This matches the file name teamdetails.html
    }

    // Handle the form submission
    @PostMapping("/teamdetails")
    public String submitBid(
            @RequestParam("teamType") String teamType,
            @RequestParam("bidPrice") double bidPrice,
            Model model) {

        // You could save the bid to the database here
        // For demo purposes, just send data back to view
        model.addAttribute("teamType", teamType);
        model.addAttribute("bidPrice", bidPrice);
        model.addAttribute("message", "Bid submitted successfully!");

        return "teamdetails"; // Return to the same page or redirect if needed
    }
}
