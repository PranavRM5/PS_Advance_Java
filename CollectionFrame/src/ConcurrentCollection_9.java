/*
9. Concurrent Collections
o Write a program to demonstrate the use of ConcurrentHashMap. Create a concurrent map of employee IDs and names. Simulate multiple threads trying to read and update the map simultaneously.
 */


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection_9 {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap to store employee IDs and names
        ConcurrentHashMap<Integer, String> employeeMap = new ConcurrentHashMap<>();

        // Add some initial employee data to the map
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");

        // Create multiple threads to perform concurrent read and update operations
        Thread t1 = new Thread(new EmployeeUpdater(employeeMap, 101, "Alicia")); // Update Alice's name
        Thread t2 = new Thread(new EmployeeUpdater(employeeMap, 104, "David"));  // Add new employee David
        Thread t3 = new Thread(new EmployeeReader(employeeMap));                 // Read all entries in the map

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final contents of the ConcurrentHashMap
        System.out.println("Final Employee Map: " + employeeMap);
    }
}

// Runnable class to update the map (add/update employee information)
class EmployeeUpdater implements Runnable {
    private ConcurrentHashMap<Integer, String> map;
    private int id;
    private String name;

    // Constructor
    public EmployeeUpdater(ConcurrentHashMap<Integer, String> map, int id, String name) {
        this.map = map;
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Updating employee ID " + id + " to name " + name);
        map.put(id, name);  // Add or update employee data
    }
}

// Runnable class to read the map
class EmployeeReader implements Runnable {
    private ConcurrentHashMap<Integer, String> map;

    // Constructor
    public EmployeeReader(ConcurrentHashMap<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        System.out.println("Reading all employee entries:");
        for (Integer id : map.keySet()) {
            System.out.println("Employee ID: " + id + ", Name: " + map.get(id));
        }
    }
}
