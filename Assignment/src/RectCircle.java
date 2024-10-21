/*
1. Abstract Class Implementation: Create an abstract class Shape with an abstract method calculateArea(). Create two subclasses Circle and Rectangle, which implement this method. Test the functionality by calculating the area of both shapes.
 */
abstract class Shape{
    public abstract void calculateArea(double a, double b);
}
class Circle extends Shape{
    @Override
    public void calculateArea(double a, double b) {
        System.out.println("Area of Circle : "+(Math.PI*a*a));
    }
}
class Rectangle extends Shape{
    @Override
    public void calculateArea(double a, double b) {
        System.out.println("Area of Rectangle : "+(a*b));
    }
}

public class RectCircle {
    public static void printArea(Shape s, double a, double b)
    {
        s.calculateArea(a,b);
    }
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        printArea(c,2, 0);
        printArea(r,2,6);
    }
}








/*

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Circle class that extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea method for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method for a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to test the functionality
public class ShapeAreaDemo {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object with length 4 and width 6
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

 */