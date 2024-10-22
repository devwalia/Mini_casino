package com.DevWalia.casino.casino_api.model;

public class Game {
    private Long id;
    private String name;
    private double winProbability;
    private double winningMultiplier;
    private double maxBet;
    private double minBet;

    // Constructor
    public Game(Long id, String name, double winProbability, double winningMultiplier, double maxBet, double minBet) {
        this.id = id;
        this.name = name;
        this.winProbability = winProbability;
        this.winningMultiplier = winningMultiplier;
        this.maxBet = maxBet;
        this.minBet = minBet;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(double winProbability) {
        this.winProbability = winProbability;
    }

    public double getWinningMultiplier() {
        return winningMultiplier;
    }

    public void setWinningMultiplier(double winningMultiplier) {
        this.winningMultiplier = winningMultiplier;
    }

    public double getMaxBet() {
        return maxBet;
    }

    public void setMaxBet(double maxBet) {
        this.maxBet = maxBet;
    }

    public double getMinBet() {
        return minBet;
    }

    public void setMinBet(double minBet) {
        this.minBet = minBet;
    }
}
