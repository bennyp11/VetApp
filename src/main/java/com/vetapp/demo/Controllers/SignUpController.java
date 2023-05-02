package com.vetapp.demo.Controllers;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.DAO.SignUpDAO;
import com.vetapp.demo.Models.Customers;

public class SignUpController {

    private SignUpDAO signUpDAO;

    public SignUpController(DB db) {
        signUpDAO = new SignUpDAO(db);
    }

    public boolean registerCustomer(Customers customer) {
        return signUpDAO.registerCustomer(customer);
    }

    public static void main(String[] args) {
        DB db = new DB();
        db.init();
        SignUpController signUpController = new SignUpController(db);

        // Example usage
        String name = "John Doe";
        String email = "john.doe@example.com";
        String phoneNumber = "123-456-7890";
        String[] petNames = {"Buddy", "Max"};
        String address = "1234 Elm Street";
        int visits = 0;
        String password = "password123";

        Customers customer = new Customers(name, email, password, phoneNumber, petNames, address, visits);

        if (signUpController.registerCustomer(customer)) {
            System.out.println("Customer registration successful!");
        } else {
            System.out.println("Customer registration failed.");
        }

        db.destroy();
    }
}
