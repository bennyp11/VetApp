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
        String query = "INSERT INTO customers (name, email, phone_number, pet_names, address, visits) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = db.getConnection();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getPhoneNumber());

            String[] petNames = customer.getPetNames();
            String petNamesString = String.join(",", petNames);
            preparedStatement.setString(4, petNamesString);

            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setInt(6, customer.getVisits());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error registering customer: " + e.getMessage());
            return false;
        }
    }
}
