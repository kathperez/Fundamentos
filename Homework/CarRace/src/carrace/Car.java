
package carrace;

import java.util.Random;

/**
 *
 * @author Kath
 */
public class Car {
    private int year;
    private int horsePower;
    
    public Car (int yearA,int horsePowerA){
        year = yearA;
        horsePower = horsePowerA;
    
    }
    
    
    public void distance(){
    Random ran = new Random();
    int x=1;
    int suma=0;
    
    while (suma<=1000){
     if (suma<1000){

       int randomNumber = (ran.nextInt(2));
       int distanceTraveled = randomNumber*horsePower;
       suma = suma+distanceTraveled;
       x=x+1;
       
     } else if(suma>=1000){
        break;
       }
    }
    
//  System.out.println("Metros Recorridos: "+suma);
    System.out.println("Puntos erroneos: " + x);
    System.out.println("");
    
    }
}

   
    
    
    
    
    
    

