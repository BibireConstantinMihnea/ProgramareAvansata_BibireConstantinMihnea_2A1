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
public class Robot implements Runnable{
    private String name;
    private boolean running;
    Exploration explore;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void run(){
        while(running){
            explore.getMap().visit(1,1,this);
            try {
                sleep(4);
            } catch (InterruptedException ex) {
                System.out.print(ex);
            }
        }
    }
}
