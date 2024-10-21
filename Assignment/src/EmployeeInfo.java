/*
5. Multilevel Inheritance: Create a class Employee with fields like name and salary, and a method getDetails(). Create a subclass Manager that adds a field teamSize and another subclass Developer that adds a field programmingLanguage. Override the getDetails() method in both subclasses to include these new fields.
 */
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails(){
        return "Name: "+name+", Salary: "+salary;
    }
}

class Manager extends Employee{
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", teamSize: "+teamSize;
    }
}

class Developer extends Employee {
    String programLang;

    public Developer(String name, double salary, String programLang) {
        super(name, salary);
        this.programLang = programLang;
    }

    @Override
    public String getDetails() {
        return super.getDetails() +", Programming Language: "+programLang;
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee d = new Developer("pranav", 10020.00,"Java");

        System.out.println( d.getDetails() );

        Employee m = new Manager("pranav", 10020.00,10);

        System.out.println( m.getDetails() );

        Employee e = new Employee("pranav", 10020.00);

        System.out.println( e.getDetails() );
    }
}
