/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serverapplication;

import java.io.IOException;

/**
 *
 * @author Mihnea
 */
public class ServerApplication {

    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer();
        server.SimpleServer();
    }
}
