/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

/**
 *
 * @author Mihnea
 */
public class Designer extends Person {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Designer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Designer{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + '}';
    }
    
    
}
