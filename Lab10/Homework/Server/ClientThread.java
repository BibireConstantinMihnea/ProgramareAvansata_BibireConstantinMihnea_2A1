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
public class ClientThread extends Thread{

    private Socket socket = null;
    private String raspuns;
    private int turn;
    public static final int P1W = 0;
    public static final int P2W = 1;
    public static final int P1 = 0;
    public static final int P2 = 1;
    public static final int DRAW = 3;
    public static final int CONTINUE = 4;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Get the request from the input stream: client → server
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            // Send the response to the oputput stream: server → client
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            
            int player = in.read();
            if(player == P1){
                turn = 0;
            }
            else {
                turn = 1;
            }
            boolean continueToPlay = true;
            if(continueToPlay){
                if(player == P1){
                    int row = in.read();
                    int col = in.read();
                    out.write(row);
                    out.write(col);
                    in.read();
                    in.read();
                    in.readLine();
                }
                else if(player == P2){
                    in.read();
                    in.read();
                    in.readLine();
                    int row = in.read();
                    int col = in.read();
                    out.write(row);
                    out.write(col);
                }
            }
            
            
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        
    }

}
