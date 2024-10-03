package com.trustledger.models;

import java.time.LocalDate;

public class TrustRating {
    private int ratingId;
    private int userId;
    private int trustLevel;
    private LocalDate lastUpdated;

    // Конструктор
    public TrustRating(int ratingId, int userId, int trustLevel, LocalDate lastUpdated) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.trustLevel = trustLevel;
        this.lastUpdated = lastUpdated;
    }

    // Gettery і Settery
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTrustLevel() {
        return trustLevel;
    }

    public void setTrustLevel(int trustLevel) {
        this.trustLevel = trustLevel;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "TrustRating{" +
                "ratingId=" + ratingId +
                ", userId=" + userId +
                ", trustLevel=" + trustLevel +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
