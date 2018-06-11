
package semana.pkg5class;


public class Cuadrado {
    private int size;
    public Cuadrado(int sizeA){
        size = sizeA;
    }
    
   public void dibujarCuadrado(){
for (int i=1; i <= size;i++ ){
    for(int j=1; j<=size; j++){
     if(j==1 || j== size || i==1 || i== size){
       dibujarFilaLlena();
     }else{
       dibujarFilaVacio();
     }
    }
    System.out.println();
}
   }
  
  private void dibujarFilaLlena(){
      System.out.print("* ");

     }

  private void dibujarFilaVacio(){
      System.out.print("  ");

  }
}
