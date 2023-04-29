package com.vetapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookAppointmentController {

    @PostMapping("/book-appointment")
    public String bookAppointment(@RequestParam("date") String date, @RequestParam("time") String time) {
        System.out.println("Appointment booked for " + date + " at " + time);
        return "confirmation"; // replace "confirmation" with the name of your confirmation view
    }
}