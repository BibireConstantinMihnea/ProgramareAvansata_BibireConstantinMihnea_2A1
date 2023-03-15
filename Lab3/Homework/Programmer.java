/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

/**
 *
 * @author Mihnea
 */
public class Programmer extends Person{
    int numberOfActiveProjects;

    public int getNumberOfActiveProjects() {
        return numberOfActiveProjects;
    }

    public void setNumberOfActiveProjects(int numberOfActiveProjects) {
        this.numberOfActiveProjects = numberOfActiveProjects;
    }
    
    public Programmer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Programmer{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", numberOfActiveProjects=" + numberOfActiveProjects + '}';
    }
    
    
    
}
