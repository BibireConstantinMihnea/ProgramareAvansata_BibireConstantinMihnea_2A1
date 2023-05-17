/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverapplication;

/**
 *
 * @author Mihnea
 */
public class Game {
    public Board gameBoard;
    public Player p1;
    public Player p2;
    public int turn = 0;

    public Game() {
        this.gameBoard = new Board();
        this.p1 =  new Player(0);
        this.p2 = new Player(1);
    }

    public Board getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
    
    public boolean checkWinCond(Board board, int playerColour){
        for(int i=0; i<=board.getBoard().length; i++){
            for(int j=0; j<=board.getBoard().length; j++){
                if((board.getBoard()[i][j] == board.getBoard()[i][j+1] && board.getBoard()[i][j] == board.getBoard()[i][j+2] && board.getBoard()[i][j] == board.getBoard()[i][j+3] && board.getBoard()[i][j] == board.getBoard()[i][j+4] && board.getBoard()[i][j] == playerColour) ||
                       (board.getBoard()[i][j] == board.getBoard()[i][j-1] && board.getBoard()[i][j] == board.getBoard()[i][j-2] && board.getBoard()[i][j] == board.getBoard()[i][j-3] && board.getBoard()[i][j] == board.getBoard()[i][j-4] && board.getBoard()[i][j] == playerColour) ||
                           (board.getBoard()[i][j] == board.getBoard()[i+1][j] && board.getBoard()[i][j] == board.getBoard()[i+2][j] && board.getBoard()[i][j] == board.getBoard()[i+3][j] && board.getBoard()[i][j] == board.getBoard()[i+4][j] && board.getBoard()[i][j] == playerColour) ||
                                (board.getBoard()[i][j] == board.getBoard()[i-1][j] && board.getBoard()[i][j] == board.getBoard()[i-2][j] && board.getBoard()[i][j] == board.getBoard()[i-3][j] && board.getBoard()[i][j] == board.getBoard()[i-4][j] && board.getBoard()[i][j] == playerColour) ||
                                    (board.getBoard()[i][j] == board.getBoard()[i-1][j+1] && board.getBoard()[i][j] == board.getBoard()[i-2][j+2] && board.getBoard()[i][j] == board.getBoard()[i-3][j+3] && board.getBoard()[i][j] == board.getBoard()[i-4][j+4] && board.getBoard()[i][j] == playerColour) ||
                                        (board.getBoard()[i][j] == board.getBoard()[i-1][j-1] && board.getBoard()[i][j] == board.getBoard()[i-2][j-2] && board.getBoard()[i][j] == board.getBoard()[i-3][j-3] && board.getBoard()[i][j] == board.getBoard()[i-4][j-4] && board.getBoard()[i][j] == playerColour) ||
                                            (board.getBoard()[i][j] == board.getBoard()[i+1][j-1] && board.getBoard()[i][j] == board.getBoard()[i+2][j-2] && board.getBoard()[i][j] == board.getBoard()[i+3][j-3] && board.getBoard()[i][j] == board.getBoard()[i+4][j-4] && board.getBoard()[i][j] == playerColour) ||
                                                (board.getBoard()[i][j] == board.getBoard()[i+1][j+1] && board.getBoard()[i][j] == board.getBoard()[i+2][j+2] && board.getBoard()[i][j] == board.getBoard()[i+3][j+3] && board.getBoard()[i][j] == board.getBoard()[i+4][j+4] && board.getBoard()[i][j] == playerColour))
                    return true;
            }
        }
        return false;
    }
    
    public void makeMove(Board board, Player player, int X, int Y){
        board.getBoard()[X][Y] = player.getPlayerColor();
        if(checkWinCond(board, player.getPlayerColor()) == true){
            System.out.println("Player " + player.getPlayerColor() + " wins!");
        }
    }
    
}
