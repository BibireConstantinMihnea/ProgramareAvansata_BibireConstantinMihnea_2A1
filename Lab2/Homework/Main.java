/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Arrays;
import lab2.Road.RoadType;
import static lab2.Road.RoadType.COUNTRY;
import static lab2.Road.RoadType.EXPRESS;

/**
 *
 * @author Mihnea
 */
public class Main {
    
    public static void main(String[] args) {
       Problem pb = new Problem();
       //Crearea locatiilor
       Location[] sites = new Location[4];
       sites[0] = new City("Iasi", 0.0, 0.0);
       sites[1] = new Airport("Aeroportul International Iasi", 10.1, 9.7);
       sites[2] = new City("Vaslui", 40.0, 50.0);
       sites[3] = new Airport("Aeroportul International Bacau", 30.3, 20.6);
       Graph g = new Graph(4);//Cream graful problemei
       pb.locations = sites;
       RoadType e = EXPRESS;
       RoadType ctry = COUNTRY;
       //Crearea strazilor si a muchiilor aferente in graf
       Road r1 = new Road("DJ248",e, 66.0, 90, sites[0], sites[2]);
       g.addEdge(0,2);
       g.addEdge(2, 0);
       Road r2 = new Road("Strada Moara de Vant", ctry, 10.0, 30, sites[0], sites[1] );
       g.addEdge(0, 1);
       g.addEdge(1, 0);
       pb.addRoad(r1, 0);
       pb.addRoad(r2, 1);
       System.out.println(Arrays.toString(pb.locations));//Afisam locatiile
       System.out.println(Arrays.toString(pb.roads));//Afisam strazile
       System.out.println(pb.valid());//Verificarea validitatii instantei problemei
       //Verificam posibilitatea de a calatori de la o locatie la alta
       System.out.println(g.travelFromTo(0, 1));
       System.out.println(g.travelFromTo(0, 3));
    }
    
}
