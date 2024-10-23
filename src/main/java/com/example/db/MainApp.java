package com.example.db;

import com.trustledger.models.User;
import com.trustledger.models.Transaction;
import com.trustledger.models.TrustRating;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        DatabaseConfig config = new DatabaseConfig();
        config.setUrl("jdbc:mysql://localhost:3306/trust_ledger");
        config.setUsername("root");
        config.setPassword("Volodia777$$");

        DatabaseConnector connector = new DatabaseConnector(config);

        try {
            List<User> users = connector.getUsers();
            for (User user : users) {
                System.out.println(user);
            }

            List<Transaction> transactions = connector.getTransactions();
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }

            List<TrustRating> trustRatings = connector.getTrustRatings();
            for (TrustRating trustRating : trustRatings) {
                System.out.println(trustRating);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connector.closeConnection();
        }
    }
}
