/*
2. LinkedList vs ArrayList
o Create two lists, one using ArrayList and one using LinkedList. Add the same elements to both. Measure and compare the time taken for adding, removing, and searching operations in both lists.
 */



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList_2 {

    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Number of elements to test with
        int elementsCount = 100000;

        // Measure time for adding elements
        long arrayListAddTime = measureAddTime(arrayList, elementsCount);
        long linkedListAddTime = measureAddTime(linkedList, elementsCount);

        System.out.println("Time taken for adding " + elementsCount + " elements:");
        System.out.println("ArrayList: " + arrayListAddTime + " ms");
        System.out.println("LinkedList: " + linkedListAddTime + " ms");

        // Measure time for removing elements
        long arrayListRemoveTime = measureRemoveTime(arrayList);
        long linkedListRemoveTime = measureRemoveTime(linkedList);

        System.out.println("\nTime taken for removing elements:");
        System.out.println("ArrayList: " + arrayListRemoveTime + " ms");
        System.out.println("LinkedList: " + linkedListRemoveTime + " ms");

        // Measure time for searching elements
        long arrayListSearchTime = measureSearchTime(arrayList, elementsCount / 2);
        long linkedListSearchTime = measureSearchTime(linkedList, elementsCount / 2);

        System.out.println("\nTime taken for searching an element:");
        System.out.println("ArrayList: " + arrayListSearchTime + " ms");
        System.out.println("LinkedList: " + linkedListSearchTime + " ms");
    }

    // Measure time taken to add elements to the list
    private static long measureAddTime(List<Integer> list, int elementsCount) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elementsCount; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Measure time taken to remove elements from the list
    private static long measureRemoveTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() / 2); // Removing from the middle
        }
        return System.currentTimeMillis() - startTime;
    }

    // Measure time taken to search an element in the list
    private static long measureSearchTime(List<Integer> list, int searchElement) {
        long startTime = System.currentTimeMillis();
        list.contains(searchElement);
        return System.currentTimeMillis() - startTime;
    }
}
