package construction;

/**
 *
 * @author Kath
 */
public class Car {

    private int large;
    private int doors;

    public Car(int largeA, int doorsB) {
        large = largeA;
        doors = doorsB;
    }

    public void first() {
        large = large - 3;
        System.out.print(" ");

        for (int i = 1; i <= large; i++) {
            System.out.print("_");

        }
    }

    public void second() {
        large = large - (doors * 2);
        System.out.print("|");
        int backDoors = doors / 2;
        int frontDoors = (doors % 2) + 1;

        for (int i = 1; i <= backDoors; i++) {
            System.out.print("[]");
        }
        for (int i = 1; i <= large; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= frontDoors; i++) {
            System.out.print("[]");
        }

        System.out.print("\\");

    }

    public void third() {
        large = large - (doors*2);
        System.out.print("-");
        int backwheels = (doors % 2) + 1;
        int frontwheels = doors / 2;

        for (int i = 1; i <= backwheels; i++) {
            System.out.print("o-");
        }
        for (int i = 1; i <= large; i++) {
            System.out.print("-");
        }
        for (int i = 1; i <= frontwheels; i++) {
            System.out.print("o-");
        }

        System.out.print("-'");

    }
}
