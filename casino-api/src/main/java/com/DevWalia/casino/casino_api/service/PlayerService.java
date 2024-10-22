package com.DevWalia.casino.casino_api.service;

import com.DevWalia.casino.casino_api.model.Player;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerService {

    private Map<String, Player> players = new HashMap<>();

    // Register a new player
    public Player registerPlayer(Player player) {
        if (player.getBirthdate().isBefore(LocalDate.now().minusYears(18))) {
            players.put(player.getUsername(), player);
            return player;
        } else {
            throw new IllegalArgumentException("Player must be 18 or older.");
        }
    }

    // Retrieve player by username
    public Player getPlayerByUsername(String username) {
        return players.get(username);
    }

    // Handle deposits
    public void deposit(String username, double amount) {
        Player player = players.get(username);
        if (player != null) {
            player.setBalance(player.getBalance() + amount);
        } else {
            throw new IllegalArgumentException("Player not found.");
        }
    }

    // Get player balance
    public double getPlayerBalance(String username) {
        Player player = players.get(username);
        if (player == null) {
            throw new IllegalArgumentException("Player not found.");
        }
        return player.getBalance();
    }
}
