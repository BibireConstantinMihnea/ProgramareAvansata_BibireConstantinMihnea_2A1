/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihnea
 */
public class Cell {
     private final List<Token> tokens = new ArrayList<>();

    public boolean isEmpty() {
        return tokens.isEmpty();
    }

    public void addToken(Token token) {
        tokens.add(token);
    }

    @Override
    public String toString() {
        return "Cell{tokens=" + tokens + "}";
    }
}
