package com.vetapp.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.DAO.SignUpDAO;
import com.vetapp.demo.Models.Customers;

@Controller
public class SignUpController {

    private SignUpDAO signUpDAO;

    @Autowired
    public SignUpController(DB db) {
        signUpDAO = new SignUpDAO(db);
    }

    @PostMapping("/sign-up")
    public ModelAndView registerCustomer(@ModelAttribute Customers customer) {
        ModelAndView modelAndView = new ModelAndView();
        
        if (signUpDAO.registerCustomer(customer)) {
            modelAndView.setViewName("welcome");
            modelAndView.addObject("message", "Customer registration successful!");
        } else {
            modelAndView.setViewName("sign-up");
            modelAndView.addObject("error", "Customer registration failed. Please try again.");
        }

        return modelAndView;
    }
}
