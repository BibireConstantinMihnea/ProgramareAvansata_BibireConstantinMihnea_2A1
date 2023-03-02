/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Mihnea
 */
public class Location {
    private String name;
    private LocationType type;
    private double X;
    private double Y;
    public enum LocationType {
        CITY,
        AIRPORT,
        GASSTATION;
    }
    
    public Location(){
    }
    
    public Location(String name, LocationType type, double x, double y){
        this.name = name;
        this.type = type;
        this.X = x;
        this.Y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", type=" + type + ", X=" + X + ", Y=" + Y + '}';
    }
    
    
}
