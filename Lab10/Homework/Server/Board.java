/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverapplication;

/**
 *
 * @author Mihnea
 */
public class Board {
    public int[][] board = new int [15][15];

    public Board() {
        for(int i=0; i<=14; i++){
            for(int j=0; j<=14; j++){
                board[i][j] = 2;
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board{" + "board=" + board + '}';
    }
    
    
}
