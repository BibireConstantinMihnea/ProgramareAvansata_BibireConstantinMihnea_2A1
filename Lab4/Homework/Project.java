/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

/**
 *
 * @author Mihnea
 */
public class Project implements Comparable<Project>{
    private String name;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project{" + "name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Project)) {
            return false;
        }
        Project other = (Project) obj;
        return name.equals(other.name);
    }

    @Override
    public int compareTo(Project other) {
        return this.name.compareTo(other.name);
    }
    
    
}