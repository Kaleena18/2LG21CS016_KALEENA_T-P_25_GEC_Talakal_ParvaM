package com.example.biddingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

    @GetMapping("/teams")
    public String viewTeamsPage() {
        return "team"; // team.html in src/main/resources/templates
    }
}
