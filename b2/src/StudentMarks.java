/*

1:Write a program to create student class with data members rollno, marks1,mark2,mark3. Accept data (acceptInfo()) and display  using display member function. Also display total,percentage and grade.

 */



class Student{
    public int rollno;
    public double mark1;
    public double mark2;
    public double mark3;
//    public char grade;


    public void acceptInfo(int rollno, int mark1, int mark3, int mark2) {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark3 = mark3;
        this.mark2 = mark2;
//        this.grade = grade;       double mark1, double mark2, double mark3

        double pr = (this.mark1+this.mark2+this.mark3)/3;
        System.out.println("Percentage Of Student : " +pr);

        if (pr>=90)
        {
            System.out.println("Grade : A");
        }
        else if (pr>=80)
        {
            System.out.println("Grade : B");
        }
        else if (pr>=70)
        {
            System.out.println("Grade : C");
        }
        else if (pr>=60)
        {
            System.out.println("Grade : D");
        }
        else if (pr>=50)
        {
            System.out.println("Grade : E");
        }else
        {
            System.out.println("Grade : FAIL");
        }

    }



}




public class StudentMarks {
    public static void main(String[] args) {
        //student class object
        Student s = new Student();

        //passing the rollno and marks
        s.acceptInfo(11, 89,90,90);

    }
}
