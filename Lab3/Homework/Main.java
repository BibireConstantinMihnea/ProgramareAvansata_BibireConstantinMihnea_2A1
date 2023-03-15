/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Homework3;

import java.util.Collections;

/**
 *
 * @author Mihnea
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating the objects
        Network network = new Network();
        Programmer Popescu = new Programmer("Popescu");
        Programmer Olteanu = new Programmer("Olteanu");
        Designer Paduraru = new Designer ("Paduraru");
        Company Microsoft = new Company("Microsoft");
        Company Amazon = new Company ("Amazon");
        nodeComparator nodeComp = new nodeComparator();
        
        //setting specific atributes
        Popescu.setDateOfBirth("11/01/1997");
        Popescu.setNumberOfActiveProjects(3);
        Olteanu.setDateOfBirth("25/05/1999");
        Olteanu.setNumberOfActiveProjects(2);
        Paduraru.setDateOfBirth("1/12/1990");
        Paduraru.setSalary(4000);
        Microsoft.setAdress("Strada Palas Nr.7");
        Amazon.setAdress("Strada Sfantul Lazar Nr.27");
        
        //adding nodes to network
        network.addNode(Popescu);
        network.addNode(Olteanu);
        network.addNode(Paduraru);
        network.addNode(Microsoft);
        network.addNode(Amazon);
        
        //defining relationhsips between objects
        Popescu.addRelationship(Amazon, "Front-end dev");
        Amazon.addRelationship(Popescu, "Front-end dev");
        Popescu.addRelationship(Paduraru, "Relative");
        Olteanu.addRelationship(Paduraru, "Friend");
        Olteanu.addRelationship(Microsoft, "Back-end dev");
        Microsoft.addRelationship(Olteanu,"Back-end dev");
        Paduraru.addRelationship(Microsoft, "Designer");
        Microsoft.addRelationship(Paduraru,"Designer");
        Paduraru.addRelationship(Olteanu, "Friend");
        Paduraru.addRelationship(Popescu, "Relative");
        
        //sorting by node importance using the nodeComparator
        Collections.sort(network.nodes,nodeComp);
        
        //printing sorted list
        System.out.println(network);
    }
    
}
