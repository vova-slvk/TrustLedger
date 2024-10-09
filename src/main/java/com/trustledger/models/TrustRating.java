package com.trustledger.models;

import lombok.Value;

@Value
public class TrustRating {
    private int ratingId;
    private int userId;
    private int trustLevel;
    private String lastUpdated;
}