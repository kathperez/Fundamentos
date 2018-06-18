
package semana.pkg6;


public class Circulo {
    private double radio;
    
    public Circulo(double radioA){
        radio= radioA;
    
    }
    
    public double perimetroCirculo(){
         double perimetroCalcular = Math.floor(2 * 3.1416  *radio);
         return perimetroCalcular;     
    }
    
    public double areaCirculo(){
        double areaCalcular = Math.floor(3.1416*(radio*radio));
        return areaCalcular;
    }
    
}
