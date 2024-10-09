package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private Connection connection;

    public DatabaseConnector(DatabaseConfig config) {
        try {
            // Завантаження драйвера (можна пропустити для нових версій JDBC, але залишаємо для надійності)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Встановлення з'єднання
            connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing the connection: " + e.getMessage());
            }
        }
    }
}
