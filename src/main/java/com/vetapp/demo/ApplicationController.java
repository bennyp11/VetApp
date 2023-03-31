package com.vetapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sign-in")
    public String signIn() {
        return "sign-in";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "sign-up";
    }

    @GetMapping("/book-appointment")
    public String bookAppointment() {
        return "book-appointment";
    }

    @GetMapping("/appointments-dashboard")
    public String appointmentsDashboard() {
        return "appointments-dashboard";
    }

}

