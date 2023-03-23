/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.homework4;

import com.github.javafaker.Faker;
import java.util.Arrays;

/**
 *
 * @author Mihnea
 */

public class Homework4 {

    public static void main(String[] args) {
        Problem problem = new Problem();
        Faker faker = new Faker();
        Project[] projects = new Project[3];
        Student s0 = new Student(faker.name().fullName());
        Student s1 = new Student(faker.name().fullName());
        Student s2 = new Student(faker.name().fullName());
        projects[0] = new Project(faker.app().name());
        projects[1] = new Project(faker.app().name());
        projects[2] = new Project(faker.app().name());
        Algorithm alg = new Algorithm();
        problem.studentList.add(s0);
        problem.studentList.add(s1);
        problem.studentList.add(s2);
        problem.projectList.add(projects[0]);
        problem.projectList.add(projects[1]);
        problem.projectList.add(projects[2]);
       
        problem.prefMap.put(s0, Arrays.asList(projects[0], projects[1], projects[2]));
        problem.prefMap.put(s1, Arrays.asList(projects[0], projects[1]));
        problem.prefMap.put(s2, Arrays.asList(projects[0]));
        
        System.out.println(problem);
        
        problem.studentList.stream()
                .filter(s -> problem.prefMap.get(s).size() < problem.averageNumOfPref(problem.prefMap, problem.projectList))
                .forEach(System.out::println);
        
        alg.assignmentAlgorithm(problem.prefMap, problem.projectList);
        System.out.println(alg.assignmentMap);
    }
}
