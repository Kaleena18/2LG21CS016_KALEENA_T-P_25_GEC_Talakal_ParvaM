package com.example.studentcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.studentcrud.model.Employee;
import com.example.studentcrud.service.KaleenaEmployeeService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/kaleena")
public class KaleenaEmployeeController {

    @Autowired
    private KaleenaEmployeeService employeeService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("employee",employeeService.listAll() );
        return "employee/index"; 
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee emp) {
        employeeService.saveEmployee(emp);
        return "redirect:/kaleena/list";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/kaleena/list";
    }
    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id,Model model) {
        model .addAttribute("employee",employeeService.getEmployee(id));
        return "employee/edit";
    }
   
    @PostMapping("/update/{id}")
    public String saveEmployee(@PathVariable Long id, @ModelAttribute Employee emp) {
           emp.setId(id);
           employeeService.saveEmployee(emp);
           return "redirect:/users/list"; 
        }
    }