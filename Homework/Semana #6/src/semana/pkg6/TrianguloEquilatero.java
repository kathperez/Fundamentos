package semana.pkg6;

public class TrianguloEquilatero {

    private double side;

    public TrianguloEquilatero(double sideA) {
        side = sideA;
    }

    public double perimeterTriangelE() {
        double calculatePerimeter = Math.floor(3 * side);
        System.out.println("P = " + calculatePerimeter + "cm");
        System.out.println("");
        return calculatePerimeter;
    }

    public double areaTriangelE() {
        double calculateArea = Math.floor((1.732050808 / 4) * (side * side));
        System.out.println("A = " + calculateArea + "cm");
        System.out.println("");
        return calculateArea;

    }

}
