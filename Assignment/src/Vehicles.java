/*
2. Abstract Class with Multiple Methods: Create an abstract class Vehicle with methods startEngine() and stopEngine(). Create subclasses Car and Bike that implement these methods. Write a driver class to test the methods.
 */
abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicles{
    public void startEngine(){
        System.out.println("Car Engine Start.");
    }
    public void stopEngine(){
        System.out.println("Car Engine Stop.");
    }
}

class Bike extends Vehicles{
    public void startEngine(){
        System.out.println("Bike Engine Start.");
    }
    public void stopEngine(){
        System.out.println("Bike Engine Stop.");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("\n********** Car ************");
        c.startEngine();
        c.stopEngine();

        Bike b = new Bike();
        System.out.println("\n********** Bike ************");
        b.startEngine();
        b.stopEngine();
    }
}
