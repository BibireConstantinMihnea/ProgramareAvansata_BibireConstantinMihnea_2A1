/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Mihnea
 */
public class NewSession implements Runnable {

    public static final int P1W = 0;
    public static final int P2W = 1;
    public static final int P1 = 0;
    public static final int P2 = 1;
    public static final int DRAW = 3;
    public static final int CONTINUE = 4;
    
    private Socket player1;
    private Socket player2;
    public Game game;
    
    public NewSession(Socket player1, Socket player2) {
        this.player1 = player1;
        this.player2 = player2;
        
        this.game = new Game();
    }

    @Override
    public void run() {
        try {
            BufferedReader inp1 = new BufferedReader(
                    new InputStreamReader(player1.getInputStream()));

            PrintWriter outp1 = new PrintWriter(player1.getOutputStream());

            BufferedReader inp2 = new BufferedReader(
                    new InputStreamReader(player2.getInputStream()));
            
            PrintWriter outp2 = new PrintWriter(player2.getOutputStream());
            
            while(true){
                System.out.println("Introduceti prima mutare: ");
                int row = inp1.read();
                int col = inp1.read();
                game.makeMove(game.gameBoard, game.p1, row, col);
                if(game.checkWinCond(game.gameBoard, game.p1.getPlayerColor())){
                    outp1.write(P1W);
                    outp2.write(P1W);
                    sendMove(outp2, row, col, game.gameBoard);
                    break;
                } else {
                    outp2.write(CONTINUE);
                    sendMove(outp2, row, col, game.gameBoard);
                }
                row = inp2.read();
                col = inp2.read();
                game.makeMove(game.gameBoard, game.p2, row, col);
                if(game.checkWinCond(game.gameBoard, game.p2.getPlayerColor())){
                    outp1.write(P2W);
                    outp2.write(P2W);
                    sendMove(outp1, row, col, game.gameBoard);
                    break;
                } else {
                    outp1.write(CONTINUE);
                    sendMove(outp1, row, col, game.gameBoard);
                }
                
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        }
    }
    
     private void sendMove(PrintWriter out, int row, int col, Board board) {
        out.write(row);
        out.write(col);
        out.write(board.toString());
    }

}
