/*
1. ArrayList Operations
o Write a Java program to create an ArrayList of integers. Add 5 elements to it, and perform the following operations:
 Insert an element at a specific position.
 Remove an element by index.
 Get an element by index.
 Iterate through the list using a for loop.
 */


import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 5 elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Insert an element at a specific position (e.g., 2nd index)
        numbers.add(2, 25);

        // Remove an element by index (e.g., remove element at index 4)
        numbers.remove(4);

        // Get an element by index (e.g., get element at index 3)
        int element = numbers.get(3);
        System.out.println("Element at index 3: " + element);

        // Iterate through the list using a for loop
        System.out.println("ArrayList elements:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
