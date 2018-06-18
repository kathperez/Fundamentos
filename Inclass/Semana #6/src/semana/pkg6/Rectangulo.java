
package semana.pkg6;


public class Rectangulo {
   
    private double ladoA;
    private double ladoB;
    
    public Rectangulo(double ladoA2, double ladoB2){
        ladoA = ladoA2;
        ladoB= ladoB2;
    }
    
    public double perimetroRectangulo(){
      double perimetroCalcular = Math.floor(2*ladoA + 2* ladoB);
      return perimetroCalcular;
    }
    public double areaRectangulo(){
      double areaCalcular = Math.floor(ladoA*ladoB);
      return areaCalcular;
    }
    
}
