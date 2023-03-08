/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;
import java.util.*;
/**
 *
 * @author Mihnea
 */
//Clasa pentru graful problemei
public class Graph {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];
 
    // Constructor
    public Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  // Metoda pentru adaugarea muchiilor
  public void addEdge(int start, int dest) {
    adjLists[start].add(dest);
  }

  // Algoritmul DFS folosit in metoda travelFromTo()
  public void DFS(int vertex) {
    visited[vertex] = true;
    int locatie;
    
    for(int i=0; i<adjLists[vertex].size(); i++)
    {
        locatie = adjLists[vertex].get(i);
        if(!visited[locatie])
        {
            DFS(locatie);
        }
    }
  }
  //Metoda pentru determinarea posibilitatii calatoriei intre doua locatii
  public String travelFromTo(int a, int b){
      DFS(a);
      if(visited[b]) return "Putem ajunge din locatia A in locatia B.";
      else return "Nu putem ajunge din locatia A in locatia B.";
  }
}
