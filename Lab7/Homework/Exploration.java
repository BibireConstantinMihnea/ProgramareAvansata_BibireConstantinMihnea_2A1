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
    private final ExplorationMap map;
    private final List<Robot> robots = new ArrayList<>();
    public final Object lock = new Object();

    public Exploration(int row, int col) {
        map = new ExplorationMap(row,col,this);
    }

    public void start() {
        Thread timer = new Thread(new Timekeeper());
        timer.setDaemon(true);
        for (Robot robot : robots) {
            new Thread(robot).start();
        }
        timer.start();
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

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void checkCommand(String text) throws InterruptedException {
        //pause robot
        //pasue all
        //start robot
        //start all
        String all = "all";
        System.out.println("Am primit " + text);
        
        if (text.startsWith("pause")) {
            String name = text.substring(6);
            if(name.compareTo(all) == 0){
                for (Robot robot : robots){
                    robot.setCommand("p");
                    
                }
            }
            for (Robot robot : robots) {
                if (robot.getName().compareTo(name) == 0) {
                    robot.setCommand("p");
                }
            }
        } else if (text.startsWith("start")) {
            String name = text.substring(6);
            if(name.compareTo(all) == 0){
                for (Robot robot : robots){
                    robot.setCommand("sa");
                    
                }
            }
            for (Robot robot : robots) {
                if (robot.getName().compareTo(name) == 0) {
                    robot.setCommand("s");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var explore = new Exploration(3,3);
        MainFrame frame = new MainFrame(explore);
        frame.setVisible(true);
        explore.addRobot(new Robot("Wall-E", explore));
        explore.addRobot(new Robot("R2D2", explore));
        //explore.addRobot(new Robot("Optimus Prime"));
        explore.start();
    }
}
