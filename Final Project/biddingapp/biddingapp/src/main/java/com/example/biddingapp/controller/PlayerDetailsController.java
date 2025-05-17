package com.example.biddingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.biddingapp.service.PlayerRegistrationService;

@Controller
public class PlayerDetailsController {
     @Autowired
    private PlayerRegistrationService playerRegistrationService;
    

    // Serve the player details page
    @GetMapping("/playerdetails")
    public String showPlayerDetailsPage() {
        return "playerdetails"; // Without .html if in templates/
    }

    // Handle form submission
    @PostMapping("/playerdetails")
    public String submitBid(@RequestParam("teamType") String teamType,
                            @RequestParam("bidPrice") Double bidPrice,
                            Model model) {
        // You can save this info to the database or process it
        System.out.println("Team: " + teamType + ", Bid Price: " + bidPrice);

        // Optionally pass data back to the UI
        model.addAttribute("message", "Bid submitted successfully for team: " + teamType);

        // Redirect back or to a success page
        return "redirect:/player-details"; // or a success view
    }
    @GetMapping("/details/{id}")
    public String editplayerdetails(@PathVariable Long id,Model model) {
        model.addAttribute("playerdetails",playerRegistrationService.getPlayerRegistration(id));
        return "playerdetails";
    }
   
   
}