package com.vetapp.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppointmentQuestionnaireController {

    @GetMapping("/appointment")
    public String showQuestionnaire() {
        return "questionnaire";
    }

    @PostMapping("/appointment")
    public String processQuestionnaire(@RequestParam("petName") String petName,
                                       @RequestParam("ownerName") String ownerName,
                                       @RequestParam("breed") String breed,
                                       @RequestParam("age") int age,
                                       @RequestParam("gender") String gender,
                                       @RequestParam("medicalConditions") String medicalConditions,
                                       @RequestParam("medications") String medications,
                                       @RequestParam("allergies") String allergies,
                                       @RequestParam("vaccinations") String vaccinations,
                                       Model model) {
        System.out.println("Pet Name: " + petName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Medical Conditions: " + medicalConditions);
        System.out.println("Medications: " + medications);
        System.out.println("Allergies: " + allergies);
        System.out.println("Vaccinations: " + vaccinations);

        return "confirmation";
    }
}
