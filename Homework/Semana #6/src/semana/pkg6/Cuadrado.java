package semana.pkg6;

public class Cuadrado {

    private double side;

    public Cuadrado(double sideA) {
        side = sideA;

    }

    public double perimeterSquare() {
        double perimeterCalculate = Math.floor(4 * side);
        System.out.println("P = " + perimeterCalculate + "cm");
        System.out.println("");
        return perimeterCalculate;
    }

    public double areaSquare() {
        double areaCalculate = Math.floor(side * side);
        System.out.println("A = " + areaCalculate + "cm");
        System.out.println("");
        return areaCalculate;
    }
}
