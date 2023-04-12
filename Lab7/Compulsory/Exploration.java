/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihnea
 */
public class Exploration {

    private final SharedMemory mem = new SharedMemory(10);
    private final ExplorationMap map = new ExplorationMap();
    private final List<Robot> robots = new ArrayList<>();

    public void start() {
        for (Robot robot : robots) {
            new Thread(robot).start();
        }
    }

    public SharedMemory getMem() {
        return mem;
    }

    public ExplorationMap getMap() {
        return map;
    }

    public List<Robot> getRobots() {
        return robots;
    }
    
    public void addRobot(Robot robot){
        robots.add(robot);
    }
    

    public static void main(String[] args) {
        var explore = new Exploration();
        explore.addRobot(new Robot("Wall-E"));
        explore.addRobot(new Robot("R2D2"));
        explore.addRobot(new Robot("Optimus Prime"));
        explore.start();
        System.out.println(explore.getMap().toString());
    }
}
