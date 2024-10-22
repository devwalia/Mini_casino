package com.DevWalia.casino.casino_api.controller;

import com.DevWalia.casino.casino_api.model.Player;
import com.DevWalia.casino.casino_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/casino")
public class CasinoController {

    @Autowired
    private PlayerService playerService;

    // Register a new player
    @PostMapping("/register")
    public ResponseEntity<String> registerPlayer(@RequestBody Player player) {
        try {
            playerService.registerPlayer(player);
            return new ResponseEntity<>("Player registered successfully", HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // Deposit money into player's account
    @PostMapping("/deposit")
    public ResponseEntity<String> depositMoney(@RequestParam String username, @RequestParam double amount) {
        playerService.deposit(username, amount);
        return new ResponseEntity<>("Deposit successful", HttpStatus.OK);
    }

    // Get player balance
    @GetMapping("/balance")
    public ResponseEntity<Double> getPlayerBalance(@RequestParam String username) {
        double balance = playerService.getPlayerBalance(username);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }
}
