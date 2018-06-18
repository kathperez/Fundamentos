
package race;


public class Wheels {
    
    private String brand;
    private int wheelssize;
    
   private static final double MAX_WHEEL_SIZE =20;
   
   
   public Wheels(String brandA,int wheelssizeA){
   brand = brandA;
   wheelssize = wheelssizeA;
    
    }
    
   public double WheelsMove(){
   
       double getFactor = wheelssize / 20.0;
        return getFactor;
   }
    
}
