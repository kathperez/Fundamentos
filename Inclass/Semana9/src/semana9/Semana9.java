package semana9;

public class Semana9 {

    public static void main(String[] args) {

//        int[][] matriz = new int[5][5];
        int[][] matriz = {
            {1, 3, 5},
            {5, 1, 2},
            {7, 9, 1},};

        int diagonal = 0;
        boolean hasA = false;
        boolean diagonalOk = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    if (!hasA) {
                        hasA = true;
                        diagonal = matriz[i][j];

                    } else if (diagonal != matriz[i][j]) {
                        diagonalOk = false;
                    }

                }
            }

        }
        System.out.println("Diagonal: " + (diagonalOk ? "Simetrica" : "No es simetrica"));

    }
}  
