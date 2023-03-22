/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mihnea
 */
public class Problem {
     public Map<Student, List<Project>> prefMap = new HashMap<>();
     public List<Project> projectList = new ArrayList();
     public List<Student> studentList = new ArrayList();

    public Problem() {
    }
    
    public void addProject(Project project){
        projectList.add(project);
    }
    
    public void addStudent(Student student){
        studentList.add(student);
    }
    
    public void addPreferences(Student student, List projList){
        prefMap.put(student, projList);
    }
    
    public double averageNumOfPref(Map<Student, List<Project>> map,List<Project> projList ){
        double mean = 0;
        for(Map.Entry<Student, List<Project>> entry : map.entrySet())
            mean += entry.getValue().size();
        mean /= projList.size();
        return mean;
    }

    @Override
    public String toString() {
        return "Problem{" + "studentList=" + studentList + ", projectList=" + projectList + '}';
    }
   
}
