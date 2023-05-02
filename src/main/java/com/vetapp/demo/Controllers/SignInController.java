package com.vetapp.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.DAO.SignInDAO;

@Controller
public class SignInController {

    private SignInDAO signInDAO;

    @Autowired
    public SignInController(DB db) {
        this.signInDAO = new SignInDAO(db);
    }

    @PostMapping("/sign-in")
    public ModelAndView authenticateCustomer(@RequestParam("email") String email, @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView();
        
        if (signInDAO.authenticateCustomer(email, password)) {
            modelAndView.setViewName("welcome");
            modelAndView.addObject("message", "Customer authentication successful!");
        } else {
            modelAndView.setViewName("sign-in");
            modelAndView.addObject("error", "Customer authentication failed. Please try again.");
        }

        return modelAndView;
    }
}



