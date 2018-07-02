package semana8;

import java.util.Random;

public class Semana8 {

    public static void main(String[] args) {
        Random rn = new Random();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rn.nextInt(15);
        }

        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = rn.nextInt(15);
        }

        int[] c = new int[10];
        

        for (int i = 0; i < c.length; i++) {
            for (int e = 0; e < b.length; e++) {
                c[i] += a[i] * b[e];
                
            }
           
            System.out.println(c[i]);
        }

    }
}
