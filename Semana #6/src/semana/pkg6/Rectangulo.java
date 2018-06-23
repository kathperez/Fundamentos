package semana.pkg6;

public class Rectangulo {

    private double sideA;
    private double sideB;

    public Rectangulo(double sideA2, double sideB2) {
        sideA = sideA2;
        sideB = sideB2;
    }

    public double perimeterRectangel() {
        double perimeterCalculate = Math.floor(2 * sideA + 2 * sideB);
        System.out.println("P = " + perimeterCalculate + "cm");
        System.out.println("");
        return perimeterCalculate;
    }

    public double areaRectangel() {
        double areaCalculate = Math.floor(sideA * sideB);
        System.out.println("A = " + areaCalculate + "cm");
        System.out.println("");
        return areaCalculate;
    }

}
