/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

import java.util.Comparator;

/**
 *
 * @author Mihnea
 */
public class nodeComparator implements Comparator<Node>{
    @Override
    public int compare(Node node1, Node node2) {
       return Integer.compare(node1.nodeImportance(node1.getRelationships()), node2.nodeImportance(node2.getRelationships()));
    }
}
