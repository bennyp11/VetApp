package com.vetapp.demo.DAO;

import com.vetapp.demo.Config.DB;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignInDAO {

    private DB db;

    public SignInDAO(DB db) {
        this.db = db;
    }

    public boolean authenticateCustomer(String email, String password) {
        String query = "SELECT password FROM customers WHERE email = ?";
        Connection connection = db.getConnection();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String hashedPassword = resultSet.getString("password");
                return BCrypt.checkpw(password, hashedPassword);
            }
        } catch (SQLException e) {
            System.err.println("Error authenticating customer: " + e.getMessage());
        }
        return false;
    }
}
