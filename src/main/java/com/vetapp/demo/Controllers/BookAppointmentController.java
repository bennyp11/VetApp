package com.vetapp.demo.Controllers;

import com.vetapp.demo.Models.Appointments;
import com.vetapp.demo.Models.Customers;
import com.vetapp.demo.Models.Pets;
import com.vetapp.demo.Models.AppointmentQuestionnaire;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookAppointmentController {

    @GetMapping("/book-appointment")
    public String showForm(Model model) {
        model.addAttribute("appointments", new Appointments());
        return "book-appointment";
    }

    @PostMapping("/submitAppointment")
    public String submitAppointment(@ModelAttribute Appointments appointments,
                                     @RequestParam("pets") String pets,
                                     @RequestParam("questionnaires") String questionnaires) {
        List<Pets> petsList = parsePets(pets);
        List<AppointmentQuestionnaire> questionnairesList = parseQuestionnaires(questionnaires);

        appointments.setPets(petsList);
        appointments.setQuestionnaires(questionnairesList);

        // Print appointment information to System.out
        System.out.println("Appointment booked:");
        System.out.println("Time: " + appointments.getDateTime());
        System.out.println("Customer ID: " + appointments.getCustomer().getId());
        System.out.println("Pets IDs: " + petsList.stream().map(Pets::getId).collect(Collectors.toList()));
        System.out.println("Questionnaires IDs: " + questionnairesList.stream().map(AppointmentQuestionnaire::getId).collect(Collectors.toList()));

        // Redirect to a confirmation page or the same page with a success message
        return "redirect:/book-appointment";
    }