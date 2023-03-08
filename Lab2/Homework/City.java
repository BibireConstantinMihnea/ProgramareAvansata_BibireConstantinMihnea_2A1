/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Mihnea
 */

/** Clasa dedicata pentru obiectele City*/
public class City extends Location {
    private int population;

    public City(String name, double x, double y) {
        super(name, x, y);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    
    
    
}
