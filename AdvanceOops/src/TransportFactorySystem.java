/*

3.
Problem: Implement a factory design pattern where you have an abstract class Transport with an abstract method deliver(). Then create subclasses Truck and Ship that implement the deliver() method. The factory class TransportFactory should decide which type of transport to return based on a parameter (e.g., Land for Truck and Sea for Ship).

Expected Outcome: Abstraction and polymorphism should be evident in how the factory class creates different types of transport objects.

 */

abstract class Transport{
    public abstract void deliver();
}

class Truck extends Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
class Ship extends Transport{
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
public class TransportFactorySystem {
    class TransportFactory{
        public static Transport createTransport(String type){
            if(type.equalsIgnoreCase("Land")) {
                return new Truck();
            }else if(type.equalsIgnoreCase("Sea")){
                return new Ship();
            }else {
                throw new IllegalArgumentException("Unknown transport type : "+type);
            }

        }
    }
    public static void main(String[] args) {
        Transport l = TransportFactory.createTransport("Land");
        l.deliver();

        Transport s = TransportFactory.createTransport("Sea");
        s.deliver();

        //Sea1 is illegal argument exception
        Transport s1 = TransportFactory.createTransport("Sea1");
        s1.deliver();
    }
}
