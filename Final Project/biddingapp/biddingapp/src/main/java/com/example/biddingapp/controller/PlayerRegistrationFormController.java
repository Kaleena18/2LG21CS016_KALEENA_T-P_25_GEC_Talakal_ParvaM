package com.example.biddingapp.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.biddingapp.model.Playerregistration;
import com.example.biddingapp.service.PlayerRegistrationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;





@Controller
@RequestMapping("/kali")
public class PlayerRegistrationFormController {

    @Autowired
    private PlayerRegistrationService playerregistrationService;

    // @GetMapping("/players")
    // public String getPlayersPage(Model model) {
    //     model.addAttribute("players",playerregistrationService.listAll() );
    //     return "players.html";  // This assumes players.html is in src/main/resources/static
    // }

    @GetMapping("/playerregistration")
    public String showForm(Model model) {
        model.addAttribute("form", new PlayerRegistrationFormController());
        return "playerregistration"; // registration.html must be in templates directory
    }

    @PostMapping("/playerregistration")
    public String handleFormSubmission(@ModelAttribute("form") PlayerRegistrationFormController form, Model model) {
        saveFile(form.getAadharImage());

        // You can save the data to a database here if needed
        model.addAttribute("message", "Registration successful!");
        return "success"; // create success.html to confirm submission
    }

    private void saveFile(Object aadharImage) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveFile'");
    }

    private Object getAadharImage() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAadharImage'");
    }
   

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("playerRegistrationForm", new Playerregistration());
        return "playerregistration";
    }
    
    @PostMapping("/save")
    public String savePlayerregistration2(
    @RequestParam("name") String name,
    @RequestParam("dob") String dob,
    @RequestParam("email") String email,
    @RequestParam("phone") String phone,
    @RequestParam("epicno") String epicno,
    @RequestParam("adress") String adress,
    @RequestParam("profilepic") MultipartFile profilepic,
    @RequestParam("epicimage") MultipartFile epicimage,
    @RequestParam("playertype") String playertype,
    @RequestParam("battingtype") String battingtype,
    @RequestParam("bowlingtype") String bowlingtype)
     {


        String uploadDir = new File("src/main/resources/static/upload/").getAbsolutePath();
        String uploadepicimage = new File("src/main/resources/static/upload/").getAbsolutePath();
        try {
        String fileName = profilepic.getOriginalFilename();
        String filePath = uploadDir + File.separator + fileName;
        profilepic.transferTo(new File(filePath));

        String epicimagefileName = epicimage.getOriginalFilename();
        String epicimagefilePath = uploadepicimage + File.separator + epicimagefileName;
        epicimage.transferTo(new File(epicimagefilePath));
        
      

        Playerregistration plyr = new Playerregistration();
        plyr.setName(name);
        plyr.setDob(dob);
        plyr.setEmail(email);
        plyr.setPhone(phone);
        plyr.setEpicno(epicno);
        plyr.setAdress(adress);
        plyr.setProfilepic("/upload/" + fileName);
        plyr.setEpicimage("/upload/" + epicimagefileName);
        plyr.setPlayertype(playertype);
        plyr.setBattingtype(battingtype);
        plyr.setBowlingtype(bowlingtype);
       
        System.out.print("IM here - plyr :" +plyr);
        playerregistrationService.savePlayerRegistration(plyr);
    } catch (IOException e) {
        e.printStackTrace();
    }
        return "redirect:/kali/list";
    }
   
   
    
}


