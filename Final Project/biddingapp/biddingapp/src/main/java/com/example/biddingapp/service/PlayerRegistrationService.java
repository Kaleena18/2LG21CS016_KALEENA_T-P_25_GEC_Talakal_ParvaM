package com.example.biddingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biddingapp.model.Playerregistration;
import com.example.biddingapp.repository.PlayerRegistrationRepository;

@Service
public class PlayerRegistrationService {

    @Autowired
    private  PlayerRegistrationRepository playerRegistrationRepository;

    public List<Playerregistration> listAll() {
        return playerRegistrationRepository.findAll();
    }

    public void savePlayerRegistration(Playerregistration plyr) {
        playerRegistrationRepository.save(plyr);
    }

    public Playerregistration getPlayerRegistration(Long id) {
        return playerRegistrationRepository.findById(id).orElse(null);
    }

    public void deletePlayerRegistration(Long id) {
        playerRegistrationRepository.deleteById(id);
    }

    public void save(Playerregistration plyr) {
       
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public static Object getplayerregistration(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getplayerregistration'");
    }
}