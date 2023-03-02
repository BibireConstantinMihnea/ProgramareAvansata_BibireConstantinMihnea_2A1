/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import lab2.Location.LocationType;
import static lab2.Location.LocationType.AIRPORT;
import static lab2.Location.LocationType.CITY;
import lab2.Road.RoadType;
import static lab2.Road.RoadType.COUNTRY;
import static lab2.Road.RoadType.EXPRESS;

/**
 *
 * @author Mihnea
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Location l1 = new Location();
        l1.setName("Iași");
        l1.setType(Location.LocationType.CITY);
        l1.setX(0.0);
        l1.setY(0.0);
        
        LocationType c = CITY; 
        LocationType a = AIRPORT;
        
        Location l2 = new Location("Vaslui", c, 40.0, 50.0);
        Location l3 = new Location("Aeroportul International Iasi", a, 10.1, 9.7);
        
        RoadType e = EXPRESS;
        RoadType ctry = COUNTRY;
        
        Road r1 = new Road("DJ248",e, 66.0, 90, l1, l2);
        Road r2 = new Road("Strada Moara de Vant", ctry, 10.0, 30, l1, l3 );
        
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(r1);
        System.out.println(r2);
        
    }
    
}
