/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mihnea
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList<Node>();
        Person p1 = new Person("Popescu");
        Person p2 = new Person("Olteanu");
        Person p3 = new Person ("Paduraru");
        Company c1 = new Company("Microsoft");
        Company c2 = new Company ("Amazon");
        
        if(p1.compareTo(p2) < 0 && p1.compareTo(p3) < 0){
            nodeList.add(p1);
            if(p2.compareTo(p3) < 0){
                nodeList.add(p2);
                nodeList.add(p3);
            }
            else {
                nodeList.add(p3);
                nodeList.add(p2);
            }
        }
        if(p2.compareTo(p1) < 0 && p2.compareTo(p3) < 0){
            nodeList.add(p2);
            if(p1.compareTo(p3) < 0) {
                nodeList.add(p1);
                nodeList.add(p3);
            }
            else{
                nodeList.add(p3);
                nodeList.add(p1);
            }
            
        }
        if(p3.compareTo(p1) < 0 && p3.compareTo(p2) < 0){
            nodeList.add(p3);
            if(p1.compareTo(p1) < 0){
                nodeList.add(p1);
                nodeList.add(p2);
            }
            else{
                nodeList.add(p2);
                nodeList.add(p1);
            }
        }
        if(c1.compareTo(c2) < 0){
            nodeList.add(c1);
            nodeList.add(c2);
        }
        else{
            nodeList.add(c2);
            nodeList.add(c1);
        }
        
        System.out.println(nodeList);
    }
    
}
