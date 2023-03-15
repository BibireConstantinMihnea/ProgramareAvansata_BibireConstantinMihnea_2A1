/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mihnea
 */
public class Person implements Node, Comparable<Person>{
    String name;
    String dateOfBirth;
    private Map<Node, String> relationships = new HashMap<>();

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }
    
    @Override
    public int nodeImportance(Map relationships){
        return relationships.size(); //returns the importance level of a node
    }

    @Override
    public Map<Node, String> getRelationships() {
        return this.relationships;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    
    
}
