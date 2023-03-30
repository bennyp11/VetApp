package com.vetapp.demo.Controllers;

import com.vetapp.demo.Models.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {

    @GetMapping
    @ResponseBody
    public String signUp() {
        Customers customer = new Customers("John Doe", "johndoe@email.com", "555-555-5555", new String[]{"Fido", "Fluffy"}, "123 Main St", 0);
        System.out.println(customer.toString());
        return "Signed up successfully!";
    }
}
