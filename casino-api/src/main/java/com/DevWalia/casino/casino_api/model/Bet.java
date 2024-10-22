package com.DevWalia.casino.casino_api.model;

public class Bet {
    private Long id;
    private Player player;
    private Game game;
    private double amount;
    private boolean isWin;

    // Constructor
    public Bet(Long id, Player player, Game game, double amount, boolean isWin) {
        this.id = id;
        this.player = player;
        this.game = game;
        this.amount = amount;
        this.isWin = isWin;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }
}
