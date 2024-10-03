package com.trustledger;

import com.trustledger.models.Transaction;
import com.trustledger.models.User;

import java.time.LocalDate; // Імпорт класу LocalDate

public class App {
    public static void main(String[] args) {
        // Створення об'єктів
        User user1 = new User(1, "mike_johnson", "mike.johnson@example.com", LocalDate.now()); // Використання LocalDate
        User user2 = new User(2, "sarah_wilson", "sarahwilson@example.com", LocalDate.now());

        Transaction transaction1 = new Transaction(21, 1, 2, 250.75, LocalDate.now()); // Використання LocalDate
        Transaction transaction2 = new Transaction(22, 2, 3, 120.50, LocalDate.now());

        // Вивід інформації про користувачів
        System.out.println("User 1: " + user1.getUsername() + ", Email: " + user1.getEmail());
        System.out.println("User 2: " + user2.getUsername() + ", Email: " + user2.getEmail());

        // Вивід інформації про транзакції
        System.out.println("Transaction 1: " + transaction1.getTransactionId() + ", Amount: " + transaction1.getAmount());
        System.out.println("Transaction 2: " + transaction2.getTransactionId() + ", Amount: " + transaction2.getAmount());
    }
}
