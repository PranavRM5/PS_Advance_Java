/*3:Create Student Class with RollNo,name,totalMarks and Grade
  .Create an object and initialize it using  assignStud method and print it using
printStud  method. Create Object of  the student and call Methods*/


class Student{
    public int roll_no;
    public String name;
    public double total_marks;
    public char grade;

//    Constructor for the assign the value in the student object
//    public Student(int roll_no, String name, double total_marks, char grade) {
//        this.roll_no = roll_no;
//        this.name = name;
//        this.total_marks = total_marks;
//        this.grade = grade;
//    }


    //Method to assign the value to the student object
    public void assignStud(int roll_no, String name, double total_marks, char grade) {
        this.roll_no = roll_no;
        this.name = name;
        this.total_marks = total_marks;
        this.grade = grade;
    }


    //Method to the print data of student details
    public void printStud(){
        System.out.println("the Student RollNo : "+roll_no+", Name: "+name+", totalMarks : " +total_marks+", Grade : "+grade+".");
    }



}


public class StudentDetails {
    public static void main(String[] args) {
//        Student s1 = new Student(1,"Pranav",87.56 ,'B');
//        s1.printStud();
//        Student s2=new Student(2,"Aranav",97.96 ,'A');
//        s2.printStud();

        Student s = new Student();
        s.assignStud(10,"Pranav",80.85,'B');
        s.printStud();

        s.assignStud(11,"Aranav",90.85,'A');
        s.printStud();

    }
}
