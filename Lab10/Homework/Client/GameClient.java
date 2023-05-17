/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Mihnea
 */
public class GameClient {

    String serverAddress = "127.0.0.1"; // The server's IP address
    int PORT = 8100; // The server's port

    public void Client() throws IOException {

        try (
                Socket socket = new Socket(serverAddress, PORT); PrintWriter out
                = new PrintWriter(socket.getOutputStream(), true); BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()))) {
            Scanner console = new Scanner(System.in);
            // Send a request to the server
            String request = console.nextLine();
            
            out.println(request);
            // Wait the response from the server
            String response = in.readLine();
            System.out.println(response);
        } catch (UnknownHostException e) {
            System.err.println("No server listening... " + e);
        }
    }
}
