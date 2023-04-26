/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import static java.lang.Thread.sleep;

/**
 *
 * @author Mihnea
 */
public class Timekeeper implements Runnable {

    int time = 0;
    private volatile boolean running = true;
    

    @Override
    public void run() {
        while (running) {
            time++;
            System.out.println("Timp de rulare: " + time);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if(time == 60){
                System.exit(0);
            }
        }
    }

}
