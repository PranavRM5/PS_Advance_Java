/*

2.
Problem: Create an abstract class Animal with an abstract method makeSound(). Then create concrete subclasses Dog, Cat, and Cow that implement makeSound() in their own way. Additionally, create an interface Domesticable with a method isDomesticated(). Let only some animals implement the Domesticable interface. Create a method that checks whether an animal is domestic and prints its sound.

Expected Outcome: This will demonstrate both polymorphism and the use of interfaces and abstract classes together.


 */
interface Domesticable {
    boolean isDomesticated(); // Corrected method name
}

abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal implements Domesticable{
    @Override
    public void makeSound() {
        System.out.println("Dog : bow, bow.");
    }

    public boolean isDomesticated() {
        return true;
    }
}
class Cat extends Animal implements Domesticable{
    @Override
    public void makeSound() {
        System.out.println("Cat : mou meow");
    }


    public boolean isDomesticated() {
        return true;
    }
}
class Cow extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cow : moo, moo");
    }
}





public class AnimalsSound {
    public static void checkDomesticAndSound(Animal animal) {
        animal.makeSound();
        if (animal instanceof Domesticable){
            Domesticable Dom = (Domesticable) animal;
            if (Dom.isDomesticated())
            {
                System.out.println("the "+animal.getClass().getSimpleName()+" is domesticated\n");
            }else {
                System.out.println("the "+animal.getClass().getSimpleName()+" is not domesticated\n");
            }
        }else {
            System.out.println("the "+animal.getClass().getSimpleName()+" cannot be domesticated\n");
        }
    }




    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        System.out.println("************ Dog ***********");
        checkDomesticAndSound(dog);

        System.out.println("************ Cat ***********");
        checkDomesticAndSound(cat);

        System.out.println("************ Cow ***********");
        checkDomesticAndSound(cow);

    }
}
