package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private DatabaseConfig config;
    private Connection connection;

    public DatabaseConnector(DatabaseConfig config) {
        this.config = config;
        connect();
    }

    private void connect() {
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(), config.getUsername(), config.getPassword()
            );
            System.out.println("Połączono z bazą danych!");
        } catch (SQLException e) {
            System.out.println("Błąd podczas łączenia z bazą danych: " + e.getMessage());
        }
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