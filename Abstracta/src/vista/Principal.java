
package vista;

import modelo.AnimalCarnivoro;
import modelo.AnimalHerviboro;
import modelo.Planta;


public class Principal {
    
    public static void main(String [] args){
        
        Planta planta = new Planta();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        AnimalHerviboro herviboro = new AnimalHerviboro();
        
        herviboro.alimentarse();
        carnivoro.alimentarse();
        planta.alimentarse();
    }
    
}
