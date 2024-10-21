/*
7. Custom Sorting in TreeMap
o Create a TreeMap where the key is a custom class Person (with fields like age and name), and values are Strings representing the address. Ensure that the TreeMap is sorted by age using a custom Comparator.
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for displaying the person details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}




public class TreeMap_7 {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator to sort by age
        TreeMap<Person, String> personMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge()); // Sort by age
            }
        });

        // Add Person objects as keys and addresses as values
        personMap.put(new Person("Alice", 30), "1234 Elm Street");
        personMap.put(new Person("Bob", 25), "5678 Oak Avenue");
        personMap.put(new Person("Charlie", 35), "9101 Maple Drive");
        personMap.put(new Person("David", 28), "3456 Pine Lane");

        // Iterate and print the sorted TreeMap (sorted by age)
        System.out.println("TreeMap sorted by age:");
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

