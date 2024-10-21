/*
8. Synchronized Collections
o Create a program that uses Collections.synchronizedList() to create a thread-safe version of an ArrayList. Implement a multi-threaded program where multiple threads add elements to this synchronized list.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchroCollection_8 {

    public static void main(String[] args) {
        // Create a non-synchronized ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Create a synchronized version of the ArrayList
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

        // Create multiple threads to add elements to the synchronized list
        Thread t1 = new Thread(new ListAdder(synchronizedList, 1));
        Thread t2 = new Thread(new ListAdder(synchronizedList, 2));
        Thread t3 = new Thread(new ListAdder(synchronizedList, 3));

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final contents of the synchronized list
        System.out.println("Final List Contents: " + synchronizedList);
    }
}

// Runnable class to add elements to the list
class ListAdder implements Runnable {
    private List<Integer> list;
    private int threadId;

    // Constructor
    public ListAdder(List<Integer> list, int threadId) {
        this.list = list;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        // Each thread adds 5 elements to the list
        for (int i = 1; i <= 5; i++) {
            list.add(threadId * 100 + i);  // Unique element for each thread
            System.out.println("Thread " + threadId + " added: " + (threadId * 100 + i));
        }
    }
}

