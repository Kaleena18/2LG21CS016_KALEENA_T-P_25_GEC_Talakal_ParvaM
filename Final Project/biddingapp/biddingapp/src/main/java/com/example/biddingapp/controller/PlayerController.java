package com.example.biddingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.biddingapp.service.PlayerRegistrationService;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRegistrationService playerregistrationService;

    @GetMapping("/players")
    public String getPlayersPage(Model model) {
        model.addAttribute("players",playerregistrationService.listAll() );
        return "players.html";  // This assumes players.html is in src/main/resources/static
    }
    
}
