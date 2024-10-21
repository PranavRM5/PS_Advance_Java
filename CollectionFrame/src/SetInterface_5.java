/*
5. Set Interface
o Write a program to demonstrate the use of a HashSet to store unique student names. Add multiple names to the set and show that duplicate entries are not allowed.
o Use a TreeSet to store student names in a sorted order.
 */




import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface_5 {

    public static void main(String[] args) {
        // Demonstrating HashSet: Storing unique student names
        Set<String> studentHashSet = new HashSet<>();

        // Add multiple names to the HashSet (duplicates will be ignored)
        studentHashSet.add("Alice");
        studentHashSet.add("Bob");
        studentHashSet.add("Charlie");
        studentHashSet.add("David");
        studentHashSet.add("Alice"); // Duplicate entry, won't be added

        // Display the HashSet (duplicates are not allowed)
        System.out.println("HashSet (Unique student names):");
        for (String name : studentHashSet) {
            System.out.println(name);
        }

        // Demonstrating TreeSet: Storing and sorting student names in ascending order
        Set<String> studentTreeSet = new TreeSet<>();

        // Add multiple names to the TreeSet (will be automatically sorted)
        studentTreeSet.add("Eve");
        studentTreeSet.add("David");
        studentTreeSet.add("Charlie");
        studentTreeSet.add("Bob");
        studentTreeSet.add("Alice");

        // Display the TreeSet (sorted order)
        System.out.println("\nTreeSet (Sorted student names):");
        for (String name : studentTreeSet) {
            System.out.println(name);
        }
    }
}
