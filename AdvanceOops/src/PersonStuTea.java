/*

1.
Problem: Create a real-world hierarchy where Person is the base class. Student and Teacher inherit from Person, with each class having its specific attributes like grades for students and subjects for teachers. Demonstrate how inheritance is used to share common methods and how polymorphism allows handling different types of persons.

Expected Outcome: Demonstrate inheritance where common functionality is shared, and different behavior is achieved through subclass-specific methods.

 */

class Person{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public void role(){
        System.out.println("Role : Person");
    }
}

class Student extends Person{
    public char grades;

    public Student(String name, int age, char grades) {
        super(name, age);
        this.grades = grades;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+grades);
    }

    public void role(){
        System.out.println("Role : Student");
    }
}

class Teacher extends Person{
    public String subjects;

    public Teacher(String name, int age, String subjects) {
        super(name, age);
        this.subjects = subjects;
    }

    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Subjects : "+subjects);
    }

    public void role(){
        System.out.println("Role : Teacher");
    }

}

public class PersonStuTea {
    public static void main(String[] args) {
//        Teacher t1 = new Teacher("Pranav", 20,"Phy");
//        Teacher t2 = new Teacher("Aranav", 22,"Chem");
//
//        Student s1 = new Student("Stud1", 15,'A');
//        Student s2 = new Student("Stud2", 16,'B');
//
//        t1.role();
//        t1.displayDetails();
//        System.out.println("***************************************************");
//
//        t2.role();
//        t2.displayDetails();
//        System.out.println("***************************************************");
//
//        s1.role();
//        s1.displayDetails();
//        System.out.println("***************************************************");
//
//        s2.role();
//        s2.displayDetails();

        // Creating instances of Student and Teacher
        Person student = new Student("Ram", 20, 'A');
        Person teacher = new Teacher("Shyam", 45, "Mathematics");

        student.role();
        student.displayDetails();
        System.out.println("*************************************");
        teacher.role();
        teacher.displayDetails();
    }
}
