/*
4. Sorting a List
o Create a List of custom objects Employee with fields like id, name, and salary. Write a program to:
 Sort the list by name in ascending order.
 Sort the list by salary in descending order using Comparator.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method to display Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortList_4 {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();

        // Add Employee objects to the list
        employees.add(new Employee(101, "Alice", 75000));
        employees.add(new Employee(102, "Bob", 50000));
        employees.add(new Employee(103, "Charlie", 80000));
        employees.add(new Employee(104, "David", 45000));
        employees.add(new Employee(105, "Eve", 70000));

        // Sort the list by name in ascending order
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Employees sorted by name in ascending order:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort the list by salary in descending order
        Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("\nEmployees sorted by salary in descending order:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

