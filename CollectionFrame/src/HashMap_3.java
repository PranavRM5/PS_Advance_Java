/*
3. HashMap Basics
o Write a program to store and display student names (String) and their marks (Integer) using a HashMap. Perform the following:
 Add 5 student entries.
 Update the marks of a student.
 Remove a student entry.
 Iterate and print all entries using entrySet().
 */

import java.util.HashMap;
import java.util.Map;

public class HashMap_3 {
    public static void main(String[] args) {
        // Create a HashMap to store student names and marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Add 5 student entries
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);
        studentMarks.put("Eve", 88);

        // Update the marks of a student (e.g., update Charlie's marks to 80)
        studentMarks.put("Charlie", 80);

        // Remove a student entry (e.g., remove Bob)
        studentMarks.remove("Bob");

        // Iterate and print all entries using entrySet()
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}

