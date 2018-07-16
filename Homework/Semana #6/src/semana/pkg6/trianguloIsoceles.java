package semana.pkg6;

public class trianguloIsoceles {

    private double sideA;
    private double sideB;

    public trianguloIsoceles(double sideA2, double sideB2) {
        sideA = sideA2;
        sideB = sideB2;

    }

    public double perimeterTriangelI() {
        double calculatePerimeter = Math.floor((2 * sideA) + sideB);
        System.out.println("P = " + calculatePerimeter + "cm");
        System.out.println("");
        return calculatePerimeter;
    }

    public double areaTriangelI() {
        double result1 = (double) Math.sqrt((sideA * sideA) - ((sideB * sideB) / 4));
        double calculateArea = Math.floor((sideB * result1) / 2);
        System.out.println("A = " + calculateArea + "cm");
        System.out.println("");
        return calculateArea;
    }

}
