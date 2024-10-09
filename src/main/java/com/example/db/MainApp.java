package com.example.db;

import com.example.db.DatabaseConfig;

public class MainApp {
    public static void main(String[] args) {
        DatabaseConfig config = new DatabaseConfig();
        config.setUrl("jdbc:mysql://localhost:3306/trust_ledger");
        config.setUsername("root");
        config.setPassword("Volodia777$$");

        DatabaseConnector connector = new DatabaseConnector(config);

        connector.closeConnection();
    }
}
