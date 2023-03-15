/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

import java.util.Map;

/**
 *
 * @author Mihnea
 */
public interface Node {
    String getName();
    Map<Node, String> getRelationships();
    int nodeImportance(Map relationships);
}
