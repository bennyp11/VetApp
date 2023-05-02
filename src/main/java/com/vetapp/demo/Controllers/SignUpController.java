package com.vetapp.demo.Controllers;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.DAO.SignUpDAO;

public class SignUpController {

    private SignUpDAO signUpDAO;

    public SignUpController(DB db) {
        signUpDAO = new SignUpDAO(db);
    }

    public boolean registerUser(String username, String email, String password) {
        // Add necessary input validation and password hashing here before calling signUpDAO.registerUser()
        return signUpDAO.registerUser(username, email, password);
    }

    public static void main(String[] args) {
        DB db = new DB();
        db.init();
        SignUpController signUpController = new SignUpController(db);

        // Example usage
        String username = "JohnDoe";
        String email = "john.doe@example.com";
        String password = "password123";

        if (signUpController.registerUser(username, email, password)) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }

        db.destroy();
    }
}
