package construction;

import java.util.Scanner;

public class Construction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el largo del carro y la cantidad de puertas");
        Car car = new Car(scan.nextInt(), scan.nextInt());

        car.first();
        System.out.println("");
        car.second();
        System.out.println("");
        car.third();
    }

}
