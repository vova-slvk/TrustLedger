package com.trustledger.models;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String username;
    private String email;
    private String registrationDate;
}

