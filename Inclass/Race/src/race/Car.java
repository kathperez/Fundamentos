
package race;

import java.util.Random;


public class Car {
    private Engine engine;
    private double position = 0;
    private String brand;
    private Wheels wheels;
    
    
    public Car(String brand, int horsepower, int wheelsA) {
        engine = new Engine(brand, horsepower);
        wheels = new Wheels(brand, wheelsA);
        this.brand = brand;
    }
    
    
    public double move() {
        Random rnd = new Random();
        float factor = rnd.nextFloat();
        double movement = Math.floor(factor * engine.getHorsepower());
        double finalMove =Math.floor( movement * wheels.WheelsMove());
        position += finalMove;
        
        return position;
    }
    
    public double getPosition() {
        return position;
    }
    
    public String getBrand() {
        return brand;
    }
}
