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
public class Company implements Node, Comparable<Company> {
    String name;
    String adress;
    private Map<Node, String> relationships = new HashMap<>();

    public Company(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }

    @Override
    public int compareTo(Company other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", adress=" + adress + '}';
    }

    @Override
    public Map<Node, String> getRelationships() {
        return this.relationships;
    }

    @Override
    public int nodeImportance(Map relationships) {
        return relationships.size();//returns the importance level of a node
    }
    
}
