/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Mihnea
 */
public class Person implements Node, Comparable<Person>{
    String name;

    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
