package com.example.studentcrud.model;
import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String education;
    private String dob;
    private String experience;
    private String file;
    private String link;
    



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
