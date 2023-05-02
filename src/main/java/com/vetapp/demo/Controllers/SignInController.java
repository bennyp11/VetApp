package com.vetapp.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.DAO.SignInDAO;

public class SignInController {

    private SignInDAO signInDAO;

    public SignInController(DB db) {
        this.signInDAO = new SignInDAO(db);
    }

    public boolean authenticateCustomer(String email, String password) {
        return signInDAO.authenticateCustomer(email, password);
    }

    public static void main(String[] args) {
        DB db = new DB();
        db.init();
        SignInController signInController = new SignInController(db);

        // Example usage
        String email = "john.doe@example.com";
        String password = "password123";

        if (signInController.authenticateCustomer(email, password)) {
            System.out.println("Customer authentication successful!");
        } else {
            System.out.println("Customer authentication failed.");
        }

        db.destroy();
    }
}


