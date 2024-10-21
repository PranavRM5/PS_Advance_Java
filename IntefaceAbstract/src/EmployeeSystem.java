/*

2. Employee Management System with Multiple Roles
Problem:
Create an interface Employee with a method calculateSalary().Now, implement two classes Manager and Developer that implement the Employee interface. Each role should have different salary structures. Additionally, each class should print a description of their role along with the salary.

 */

interface Employee{
    void calculateSalary();
}

class Manager implements Employee{
    private double baseSalary;
    private double bonus;

    // Constructor to initialize Manager salary components
    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementing calculateSalary method
    @Override
    public void calculateSalary() {
        System.out.println("******************************************");
        double totalSalary = baseSalary + bonus;
        System.out.println("Role: Manager");
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Developer implements Employee{
    private double baseSalary;
    private double extraHours;
    private double hourlyRate;

    // Constructor to initialize Developer salary components
    public Developer(double baseSalary, double extraHours, double hourlyRate) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    // Implementing calculateSalary method
    @Override
    public void calculateSalary() {
        System.out.println("******************************************");
        double totalSalary = baseSalary + (extraHours * hourlyRate);
        System.out.println("Role: Developer");
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Extra Hours Worked: " + extraHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + totalSalary);
    }
}



public class EmployeeSystem {
    public static void main(String[] args) {
        Manager m = new Manager(10000,2500);
        Developer d = new Developer(20000,3,200);
        m.calculateSalary();
        d.calculateSalary();
    }
}
