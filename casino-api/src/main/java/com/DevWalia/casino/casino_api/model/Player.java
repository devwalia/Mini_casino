package com.DevWalia.casino.casino_api.model;

import java.time.LocalDate;

public class Player {
    private Long id;
    private String name;
    private String username;
    private LocalDate birthdate;
    private double balance;
    private double bonusBalance;

    // Constructor
    public Player(Long id, String name, String username, LocalDate birthdate, double balance, double bonusBalance) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.birthdate = birthdate;
        this.balance = balance;
        this.bonusBalance = bonusBalance;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }
}
