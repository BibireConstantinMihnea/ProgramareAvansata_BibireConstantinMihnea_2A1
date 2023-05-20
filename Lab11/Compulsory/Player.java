/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lab11;

/**
 *
 * @author Mihnea
 */
public class Player {
    public int playerColor; //0 = white; 1 = black

    public Player(int playerColor) {
        this.playerColor = playerColor;
    }

    public int getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(int playerColor) {
        this.playerColor = playerColor;
    }

    @Override
    public String toString() {
        return "Player{" + "playerColor=" + playerColor + '}';
    }
    
    
}
