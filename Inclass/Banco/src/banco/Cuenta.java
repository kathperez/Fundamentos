
package banco;

import java.util.Scanner;

public class Cuenta {
    Scanner scan = new Scanner(System.in);
    private int saldo = 1000;
    public String decision;
    
    public Cuenta(String decisionA){
        decision = decisionA;
    }
    
    public void acreditar(){
        if (decision.compareTo("a") == 0){
               System.out.println("Introduzca el monto que desea agregar");
              int monto = scan.nextInt();
              saldo = saldo + monto;
              System.out.println("El Saldo disponible es de: $ " + saldo);
 
          }
        
    
    
    }
    
    public void debitar(){
        if (decision.compareTo("d") == 0){
              System.out.println("Introduzca el monto a debitar");
              int monto = scan.nextInt();
              int remanente = saldo - monto;
      
              if (remanente>= 0){
                  saldo = saldo - monto;
                  System.out.println("Debito listo, quedan: $ "+ saldo);
                  
              }else {
                  System.out.println("No tiene fondos suficientes. solo tienes: $ "+ saldo);
              }
    }
        
  }
}
