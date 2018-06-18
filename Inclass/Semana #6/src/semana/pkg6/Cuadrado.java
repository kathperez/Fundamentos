
package semana.pkg6;


public class Cuadrado {
    
   private double lado ;
   
   public Cuadrado(double ladoA ){
       lado = ladoA;
       
   }
  
   public double perimetro(){
   double perimetroCalcular = Math.floor(4*lado);
   return perimetroCalcular;
   }
    
   public double area(){
   double areaCalcular = Math.floor(lado*lado);
   return areaCalcular;
   }
}
