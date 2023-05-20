/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lab11;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mihnea
 */
@RestController
@RequestMapping("/players")
    public class PlayerController {

        private final List<Player> players = new ArrayList<>();

        public PlayerController() {
            players.add(new Player(0));
            players.add(new Player(1));
        }

        @GetMapping
        public List<Player> getPlayers() {
            return players;
        }

        @GetMapping("/count")
        public int countPlayers() {
            return players.size();
        }

        @GetMapping("/{playerColor}")
        public Player getPlayer(@PathVariable("playerColor") int pc) {
            return players.stream()
                    .filter(p -> p.getPlayerColor()== pc).findFirst().orElse(null);
        }
    }
