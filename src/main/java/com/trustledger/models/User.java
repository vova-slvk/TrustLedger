package com.trustledger.models;

import java.time.LocalDate;

public class User {
    private int userId;
    private String username;
    private String email;
    private LocalDate registrationDate;

    // Конструктор
    public User(int userId, String username, String email, LocalDate registrationDate) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    // Gettery і Settery
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
