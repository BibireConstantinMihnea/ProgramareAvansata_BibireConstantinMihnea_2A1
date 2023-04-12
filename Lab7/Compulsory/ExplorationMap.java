/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.List;

/**
 *
 * @author Mihnea
 */
public class ExplorationMap {
    private final List<Token>[][] matrix = null;
    Exploration explore;
    
    public boolean visit(int row, int col, Robot robot){
        synchronized (matrix[row][col]){
            if(matrix[row][col].isEmpty()){
                matrix[row][col] = explore.getMem().extractTokens(1);
                System.out.println("Cell with row= " + row + " col= " + col + " successfuly visited.");
            }
            return true;
        }
    }

    public List<Token>[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        return "ExplorationMap{" + "matrix=" + matrix + '}';
    }
    
}
