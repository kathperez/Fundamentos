
package carrace;

public class CarRace {

    public static void main(String[] args) {
       Car mazda = new Car(2015,100);
       
       Car honda = new Car(2017,150);
       
       Car bmw = new Car (2016,190);
   
       System.out.println("Carrera 2018");
       System.out.println("Instrucciones: El ganador de la carrera es el que obtenga menos puntos erroneos");
       System.out.println("");
       System.out.println("BMW");
       bmw.distance();
       System.out.println("HONDA");
       honda.distance();
       System.out.println("MAZDA");
       mazda.distance();

    }
}
    

