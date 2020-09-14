package com.patientdemo.controller;

import com.patientdemo.model.Patient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    

    @GetMapping("/register")
    public String showForm(Model model) {
        Patient patient = new Patient();
        model.addAttribute("patient", patient);

        return "index";
    }

    

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("patient") Patient patient) {
        System.out.print(patient);

        return "search";
    }

}