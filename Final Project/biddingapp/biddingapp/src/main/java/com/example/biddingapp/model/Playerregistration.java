package com.example.biddingapp.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playerregistarion")

public class Playerregistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String name;
    private String dob;
    private String email;
    private String phone;
    private String epicno;
    private String adress;
    private String profilepic;
    private String epicimage;
    private String playertype;
    private String battingtype;
    private String bowlingtype;

   


    public Long getId( ) {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEpicno(){
        return epicno;
    }
    public void setEpicno(String epicno){
        this.epicno = epicno;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getProfilepic(){
        return profilepic;
    }
    public void setProfilepic(String profilepic){
        this.profilepic = profilepic;
    }
    public String getEpicimage(){
        return epicimage;
    }
    public void setEpicimage(String epicimage){
        this.epicimage = epicimage;
    }
    public String getPlayertype(){
        return playertype;
    }
    public void setPlayertype(String playertype){
        this.playertype = playertype;
    }
    public String getBattingtype(){
        return battingtype  ;
    }
    public void setBattingtype(String battingtype2){
        this.battingtype= battingtype2;
    }
    public String getBowlingtype(){
        return bowlingtype;
    }
    public void setBowlingtype(String bowlingtype){
        this.bowlingtype= bowlingtype;
    }

    @Override
    public String toString(){
        return    "savePlayerRegistration : name " + name + ", " +
         dob + " , " +
         email + " , " +
         phone + " , " +
         epicno + " , " +
         adress + " , " +
         profilepic + " , " +
         epicimage + " , " +
         playertype + " , " +
         battingtype + " , " +
         bowlingtype;
    }
    public static Playerregistration getPlayerById(Long id2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getPlayerById'");
    }

}

