/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Mihnea
 */
public class Problem {
    public Location[] locations;
    public Road[] roads = new Road[2];

    //Metoda pentru adaugarea strazilor in vectorul roads
    public void addRoad(Road obj, int pos){
        this.roads[pos] = obj;
    }
    
    //Metoda pentru determinarea validitatii instantei problemei
    public String valid(){
        for(int i=0; i<2; i++)
        {
            for(int j=i+1; j<=2; j++)
            {
                if(locations[i].name.equals(locations[j].name))
                    return "Instanta problemei este invalida.";
            }
        }
        for(int i=0; i<1; i++)
        {
            for(int j=i+1; j<=1; j++)
            {
                if(roads[i].name.equals(roads[j].name))
                    return "Instanta problemei este invalida.";
            }
        }
        return "Instanta problemei este valida";
    }

    @Override
    public String toString() {
        return "Problem{" + "locations=" + locations + ", roads=" + roads + '}';
    }

    
}
