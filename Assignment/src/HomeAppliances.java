/*
6. Hierarchical Inheritance: Create a class Appliance with a method turnOn(). Create two subclasses Fan and AirConditioner that inherit from Appliance and override turnOn() with specific functionality.
 */

class Appliances{
    public void turnOn(){
        System.out.println("turn on appliances... ");
    }
}

class Fan extends Appliances{
    @Override
    public void turnOn() {
        System.out.println("Turn On Fan... ");
    }
}

class AirConditioner extends Appliances{
    @Override
    public void turnOn() {
        System.out.println("Turn On AirConditioner... ");
    }
}


public class HomeAppliances {
    public static void main(String[] args) {
        Appliances a = new Appliances();
        a.turnOn();

//        Appliances Af = new Fan();
//        Af.turnOn();

        Fan f = new Fan();
        f.turnOn();

        AirConditioner ac = new AirConditioner();
        ac.turnOn();
    }
}
