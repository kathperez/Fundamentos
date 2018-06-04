
package semana4;

import java.util.Random;


public class Semana4 {

    public static void main(String[] args) {
      Random rn = new Random();
        
        int i;

        for (i=1; i<=8;i++){
            int golesA = rn.nextInt(4) ;
            int golesB = rn.nextInt(4) ;
            int golesC = rn.nextInt(4) ;
            int golesD = rn.nextInt(4) ;
            System.out.println("Resultado de Grupo " + i);
            System.out.println();
            System.out.println("Equipo A " + golesA + " - Equipo B " + golesB);
            System.out.println("Equipo B " + golesB + " - Equipo D " + golesD);
            System.out.println("Equipo A " + golesA + " - Equipo C " + golesC);
            System.out.println("Equipo A " + golesA + " - Equipo D " + golesD);
            System.out.println("Equipo B " + golesB + " - Equipo C " + golesC);
            System.out.println("Equipo C " + golesC + " - Equipo D " + golesD);
            System.out.println();
           
        }
         String[] teams = "a,b,c,d".split(",");
        int n = 2;                 
        int r = teams.length;   
        Perm(teams, "", n, r);
    }

    private static void Perm(String[] team, String repeat, int n, int r) {
        if (n == 0) {
            System.out.println(repeat);
        } else {
            for (int i = 0; i < r; i++) {
                if (!repeat.contains(team[i])) { // Controla que no haya repeticiones
                    Perm(team, repeat + team[i] + ", ", n - 1, r);
                }
            }
        }
    }
    }
    

