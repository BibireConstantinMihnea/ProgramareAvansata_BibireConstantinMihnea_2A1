/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 *
 * @author Mihnea
 */
//algoritmul greedy de facut separat
//greedy -> pe tipul primul venit primul servit, daca nu mai sunt proiecte disponibile intre optiuni atunci nu primeste proiect
public class Lab4 {

    public static void main(String[] args) {
        List<Student> listOfStudents = new LinkedList<>();
        TreeSet<Project> treeOfProjects = new TreeSet<>();
        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i))
                .toArray(Student[]::new);
        
        for(Student s : students) {
            listOfStudents.add(s);
        }
        
        Collections.sort(listOfStudents);
        
        for(int i=0; i<4; i++){
            System.out.println(students[i].toString());
        }
      var projects = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Project("S" + i))
                .toArray(Project[]::new);
      
      for(Project p : projects){
          treeOfProjects.add(p);
      }
        
        for(int i=0; i<4; i++){
            System.out.println(projects[i].toString());
        }  
    }
}
