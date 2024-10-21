/*
1. Create a class Person with data members as name, age, city. Write getters and setters for all the data members. Also add the display function. Create Default and Parameterized constructors. Create the object of this class in main method and invoke all the methods in that class.
 */


class Person{
    private String name;
    private int age;
    private String city;

    //default parameter constructor
    public Person() {
        this.name = "Raj";
        this.age = 20;
        this.city = "Jalgaon";
    }

    //Constructor for assign the value
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void displayPersonInfo(){
        System.out.println("Person Name : "+name);
        System.out.println("Person Age : "+age);
        System.out.println("Person City : "+city);
    }


    //getter and setter
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}









public class PersonInfo {
    public static void main(String[] args) {
        Person p = new Person();
        p.displayPersonInfo();

        System.out.println("**************************************************************");

        Person p1 = new Person(" Raksha ", 22," Jalgaon ");
//        Person p1 = new Person();
//        p1.setName(" Pranav "); p1.setAge( 22 ); p1.setCity(" Dasnur ");
        p1.displayPersonInfo();

        System.out.println("**************************************************************");

        Person p2 = new Person(" Pranav ", 22," Dasnur ");
//        Person p2 = new Person();
//        p2.setName(" Pranav "); p2.setAge( 22 ); p2.setCity(" Dasnur ");
        p2.displayPersonInfo();

    }
//    public String, int displayPersonInfo(String getName, int getAge, String getCity){
//        System.out.println("Person Name : "+getName);
//        System.out.println("Person Age : "+getAge);
//        System.out.println("Person City : "+getCity);
//
//    }

}
