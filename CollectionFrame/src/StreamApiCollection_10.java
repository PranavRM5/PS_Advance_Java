/*
10. Stream API with Collections
o Create a List of integers and perform the following using the Stream API:
 Filter out all even numbers.
 Find the maximum number in the list.
 Sort the numbers in descending order.
 Print each element using the forEach method.
 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiCollection_10 {

    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        // 1. Filter out all even numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        // 2. Find the maximum number in the list
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        maxNumber.ifPresent(max -> System.out.println("Maximum Number: " + max));

        // 3. Sort the numbers in descending order
        List<Integer> sortedDescending = numbers.stream()
                .sorted((num1, num2) -> num2.compareTo(num1))
                .collect(Collectors.toList());
        System.out.println("Numbers Sorted in Descending Order: " + sortedDescending);

        // 4. Print each element using the forEach method
        System.out.println("All Numbers:");
        numbers.forEach(num -> System.out.println(num));
    }
}

