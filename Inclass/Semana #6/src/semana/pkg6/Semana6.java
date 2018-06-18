
package semana.pkg6;

import java.util.Scanner;


public class Semana6 {

   
    public static void main(String[] args) {
        
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; 
       int opcion2;
       
        
        
       while(!salir){
           
           System.out.println("1. Perimetro");
           System.out.println("2. Area");
           System.out.println("3. Salir");
           
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           System.out.println("");
           
            
           switch(opcion){
               case 1:
                   
                   System.out.println("1. Cuadrado");
                   System.out.println("2. Rectangulo");
                   System.out.println("3. Circulo");
                   System.out.println("4. Salir");
                   System.out.println("Escribe una de las opciones");
                   opcion2 = sn.nextInt();
                   System.out.println("");
                   
                   
                     switch (opcion2){
                         case 1:
                           System.out.println("¿Cuanto miden los lados del cuadrado? ");
                           Cuadrado cuadraP = new Cuadrado(sn.nextDouble()); 
                           System.out.println("P = " + cuadraP.perimetro());
                           System.out.println("");
                           break;
                           
                         case 2:
                           System.out.println("¿Cuanto mide el lado A y el lado B del rectangulo?");
                           Rectangulo rectanP = new Rectangulo(sn.nextDouble(),sn.nextDouble());
                           System.out.println("P = "+ rectanP.perimetroRectangulo());
                           System.out.println("");
                           break;
                           
                         case 3:
                             System.out.println("¿Cuanto mide el radio del circulo? ");
                             Circulo cirP = new Circulo(sn.nextDouble());
                             System.out.println("P = "+ cirP.perimetroCirculo());
                             System.out.println("");
                             break;
                           
                     
                     }
                   
                   break;
               case 2:
                   System.out.println("Área");
                   System.out.println("1. Cuadrado");
                   System.out.println("2. Rectangulo");
                   System.out.println("3. Circulo");
                   System.out.println("4. Salir");
                   
                   System.out.println("Escribe una de las opciones");
                   opcion2 = sn.nextInt();
                   System.out.println("");
                   
                   switch (opcion2){
                       case 1:
                           System.out.println("¿Cuanto miden los lados del cuadrado? ");
                           Cuadrado cuadraA = new Cuadrado(sn.nextDouble());
                           System.out.println("A = " + cuadraA.area());
                           System.out.println("");
                           break;
                       case 2:
                           System.out.println("¿Cuanto mide el lado A y el lado B del rectangulo?");
                           Rectangulo rectanA = new Rectangulo(sn.nextDouble(),sn.nextDouble());
                           System.out.println("A = " + rectanA.areaRectangulo());
                           System.out.println("");
                           break;
                           
                       case 3:
                           System.out.println("¿Cuanto mide el radio del circulo? ");
                           Circulo cirA = new Circulo(sn.nextDouble());
                           System.out.println("A = "+ cirA.areaCirculo());
                           System.out.println("");
                           break;
                   }
                   
                   break;
                   
                case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
                   System.out.println("");
           }
            
       }
       
    }
    }
    

