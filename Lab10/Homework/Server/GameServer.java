/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mihnea
 */
public class GameServer {

    public static final int PORT = 8100;
    public static final int P1 = 0;
    public static final int P2 = 1;
    public int numPlayers;

    public void SimpleServer() throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            while (numPlayers < 2) {
                System.out.println("Waiting for a player to connect ...");
                Socket player1 = serverSocket.accept();
                numPlayers++;
                System.out.println("Player #" + numPlayers + " connected.");
                new ClientThread(player1).start();
                new PrintWriter(player1.getOutputStream()).write(P1);
                
                Socket player2 = serverSocket.accept();
                numPlayers++;
                System.out.println("Player #" + numPlayers + " connected.");
                new ClientThread(player2).start();
                new PrintWriter(player1.getOutputStream()).write(P2);
                
                System.out.println("Starting session ...");
                NewSession task = new NewSession(player1, player2);
                Thread t1 = new Thread(task);
                t1.start();
            }
            System.out.println("We have 2 players no longer accepting connections.");
        } catch (IOException e) {
            System.err.println("Ooops... " + e);
        } finally {
            serverSocket.close();
        }
    }
}
