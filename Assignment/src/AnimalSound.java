/*
4.* Single Inheritance: Create a base class Animal with a method sound(). Create a subclass Dog that extends Animal and overrides the sound() method to bark. Test the functionality by creating an object of Dog and calling the sound() method.
 */

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("bow, bow");
    }
}


public class AnimalSound {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal d1 = new Dog();
        d1.sound();

//        Dog a1 = new Animal();
//        a1.sound();
    }
}
