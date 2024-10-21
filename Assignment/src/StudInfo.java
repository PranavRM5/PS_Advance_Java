/*
10. Getters and Setters: Create a class Student with private fields name, age, and
grade. Provide public getter and setter methods to access and modify these fields.
Write a main method to test the encapsulation by setting and getting the values.
 */
class Student{
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}

public class StudInfo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ram");
        s.setAge(22);
        s.setGrade('A');

        System.out.println("Name: "+s.getName()+", Age: "+s.getAge()+", Grade: "+s.getGrade());
    }
}
