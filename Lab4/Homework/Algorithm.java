/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mihnea
 */
public class Algorithm {

    public Map<Student, Project> assignmentMap = new HashMap();

    public Algorithm() {
    }

    public void assignProject(Student student, Project project) {
        assignmentMap.put(student, project);
    }

    public void assignmentAlgorithm(Map<Student, List<Project>> prefMap, List<Project> projectList) {
        for (Map.Entry<Student, List<Project>> entry : prefMap.entrySet()) {
            int i = 0;
            if (assignmentMap.isEmpty() == true) {
                assignProject(entry.getKey(), entry.getValue().get(i));
            }
            while (i < entry.getValue().size()) {
                if (assignmentMap.containsValue(entry.getValue().get(i))) {
                    i++;
                } else {
                    assignProject(entry.getKey(), entry.getValue().get(i));
                }
            }
        }

    }
}
