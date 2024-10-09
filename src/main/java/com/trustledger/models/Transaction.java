package com.trustledger.models;

import lombok.Value;

@Value
public class Transaction {
    private int transactionId;
    private int senderId;
    private int receiverId;
    private double amount;
    private String transactionDate;
}