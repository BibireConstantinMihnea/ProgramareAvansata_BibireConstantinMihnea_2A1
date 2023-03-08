/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Mihnea
 */
//Clasa pentru obiectele Location
public abstract class Location {
    protected String name;
    protected double X;
    protected double Y;
    
    //Constructori
    public Location(){
    }
    
    public Location(String name, double x, double y){
        this.name = name;
        this.X = x;
        this.Y = y;
    }

    //Getters si Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Location{" + "name=" + name + ", X=" + X + ", Y=" + Y + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Location)) {
            return false;
        }
        Location other = (Location) obj;
        return name.equals(other.name);
    }

}
    
