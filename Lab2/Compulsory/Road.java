/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Mihnea
 */
public class Road {
    private String name;
    private double length;
    private int speedLimit;
    private Location A;
    private Location B;
    private RoadType type;
    public enum RoadType{
        HIGHWAY,
        EXPRESS,
        COUNTRY;
    }
    public Road(String name, RoadType type, double length, int speedLimit, Location a, Location b){
        this.name = name;
        this.type = type;
        this.length = length;
        this.speedLimit = speedLimit;
        this.A = a;
        this.B = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public Location getA() {
        return A;
    }

    public void setA(Location A) {
        this.A = A;
    }

    public Location getB() {
        return B;
    }

    public void setB(Location B) {
        this.B = B;
    }

    public RoadType getType() {
        return type;
    }

    public void setType(RoadType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Road{" + "name=" + name + ", length=" + length + ", speedLimit=" + speedLimit + ", A=" + A + ", B=" + B + ", type=" + type + '}';
    }
    
    
}
