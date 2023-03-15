/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihnea
 */
public class Network {
    public List<Node> nodes = new ArrayList<>();

    public Network() {
    }
   
    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network{" + "nodes=" + nodes + '}';
    }
    
}
