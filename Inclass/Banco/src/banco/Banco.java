
package banco;

import java.util.Scanner;


public class Banco {

    
    public static void main(String[] args) {
        
        
        System.out.println("¿Que quiere hacer?");
        System.out.println("Presione D = Debitar, A = Acreditar");

         Scanner scan = new Scanner(System.in);
         
         Cuenta cuenta = new Cuenta(scan.next());
  
         cuenta.acreditar();
         cuenta.debitar();
  
        
    }
    
}
