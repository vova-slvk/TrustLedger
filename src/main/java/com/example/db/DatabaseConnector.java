package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.trustledger.models.Transaction;
import com.trustledger.models.TrustRating;
import com.trustledger.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnector {
    private DatabaseConfig config;
    private Connection connection;

    public DatabaseConnector(DatabaseConfig config) {
        this.config = config;
        connect();
    }

    private void connect() { // Змінив ім'я методу на connect
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(), config.getUsername(), config.getPassword()
            );
            System.out.println("Połączono z bazą danych!");
        } catch (SQLException e) {
            System.out.println("Błąd podczas łączenia z bazą danych: " + e.getMessage());
        }
    }

    public Connection getConnection() { // Додано метод для отримання з'єднання
        return connection;
    }

    public List<User> getUsers() throws SQLException { // Додано кидання SQLException
        List<User> users = new ArrayList<>();
        String query = "SELECT user_id, username, email, registration_date FROM users";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("user_id"));
                user.setUsername(resultSet.getString("username"));
                user.setEmail(resultSet.getString("email"));
                user.setRegistrationDate(resultSet.getString("registration_date"));
                users.add(user);
            }
        }
        return users;
    }

    public List<Transaction> getTransactions() throws SQLException { // Додано кидання SQLException
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT transaction_id, sender_id, receiver_id, amount, transaction_date FROM transactions";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Transaction transaction = new Transaction(
                        resultSet.getInt("transaction_id"),
                        resultSet.getInt("sender_id"),
                        resultSet.getInt("receiver_id"),
                        resultSet.getDouble("amount"),
                        resultSet.getString("transaction_date")
                );
                transactions.add(transaction);
            }
        }
        return transactions;
    }

    public List<TrustRating> getTrustRatings() throws SQLException { // Додано кидання SQLException
        List<TrustRating> trustRatings = new ArrayList<>();
        String query = "SELECT rating_id, user_id, trust_level, last_updated FROM trust_ratings";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                TrustRating trustRating = new TrustRating(
                        resultSet.getInt("rating_id"),
                        resultSet.getInt("user_id"),
                        resultSet.getInt("trust_level"),
                        resultSet.getString("last_updated")
                );
                trustRatings.add(trustRating);
            }
        }
        return trustRatings;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Połączenie zamknięte.");
            } catch (SQLException e) {
                System.out.println("Błąd podczas zamykania połączenia: " + e.getMessage());
            }
        }
    }
}
