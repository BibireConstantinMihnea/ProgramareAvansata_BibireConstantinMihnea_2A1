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
public class ExplorationMap {

    private final List<Token>[][] matrix;
    Exploration explore;

    public ExplorationMap(int rowSize, int colSize, Exploration explore) {
        this.explore = explore;
        matrix = new List[rowSize][colSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new ArrayList<>();
            }
        }
    }

    public boolean visit(int row, int col, Robot robot) {
        synchronized (matrix[row][col]) {
            if (row >= 0 || row < 3 || col >= 0 || col < 3 || matrix[row][col].isEmpty()) {
                matrix[row][col].add(explore.getMem().extractTokens(1).get(0));
                robot.addToCount(1);
                System.out.println("Cell with row= " + row + " col= " + col + " successfuly visited by " + robot.getName());
                return true;
            }
        }
        return false;
    }

    public List<Token>[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        return "ExplorationMap{" + "matrix=" + matrix + '}';
    }

}
