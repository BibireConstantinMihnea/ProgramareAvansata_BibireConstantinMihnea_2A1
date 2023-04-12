/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Mihnea
 */
public class SharedMemory {

    public final List<Token> tokens = new ArrayList<>();

    public SharedMemory(int n) {
        for (int i = 1; i < n; i++) {
            Token token = new Token(i);
            tokens.add(token);
        }
        Collections.shuffle(tokens, new Random());
    }

    public synchronized List<Token> extractTokens(int howMany) {
        List<Token> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (tokens.isEmpty()) {
                break;
            }
            extracted.add(tokens.get(i));
        }
        return extracted;
    }

}
