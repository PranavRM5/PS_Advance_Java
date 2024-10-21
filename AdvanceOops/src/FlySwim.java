/*
4.
Problem: Create two interfaces Flyable and Swimmable, each with a method performAction(). Implement a class Superhero that implements both interfaces and provides concrete implementations of performAction() for flying and swimming. Demonstrate how the Superhero class handles both actions.

Expected Outcome: The Superhero class should show how multiple inheritance is achieved using interfaces, and the performAction() should exhibit polymorphism.
 */
interface Flyable{
    void performAction();
}
interface Swimmable{
    void performAction();
}

class Superhero implements Flyable, Swimmable{
    @Override
    public void performAction() {
        System.out.println("Superhero is flying high in the sky!\n");
    }

    public void swimAction(){
        System.out.println("Superhero is swimming across the ocean!\n");
    }
}


public class FlySwim {
    public static void main(String[] args) {
        Superhero s = new Superhero();

        System.out.println("Performing flying action:");
        s.performAction();

        System.out.println("Performing swimming action:");
        s.swimAction();
    }
}
