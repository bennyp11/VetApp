package com.vetapp.demo.DAO;

import com.vetapp.demo.Config.DB;
import com.vetapp.demo.Models.Customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpDAO {

    private DB db;

    public SignUpDAO(DB db) {
        this.db = db;
    }

    public boolean registerCustomer(Customers customer) {
        String query = "INSERT INTO customers (name, email, phone_number, pet_names, address, visits, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = db.getConnection();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // ... (previous preparedStatement assignments)

            String hashedPassword = BCrypt.hashpw(customer.getPassword(), BCrypt.gensalt());
            preparedStatement.setString(7, hashedPassword);

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error registering customer: " + e.getMessage());
            return false;
        }
    }
}
