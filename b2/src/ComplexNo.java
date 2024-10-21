/*

5. Create a class ComplexNumber with data members real, imaginary. Create Default and Parameterized constructors. Write getters and setters for all the data members. Also add the display function. Create the object of this class in main method and invoke all the methods in that class.

 */

class Complex{
    private double realNo;
    private double imaginaryNo;

    //Default constructors
    public Complex() {
        this.realNo = 0.0;
        this.imaginaryNo = 0.0;
    }

    //Parameterized constructors
    public Complex(double realNo, double imaginaryNo) {
        this.realNo = realNo;
        this.imaginaryNo = imaginaryNo;
    }

    public void display(){
        System.out.println("********* Complex Number **************");
        System.out.println("Real Number : "+realNo);
        System.out.println("Imaginary Number : "+imaginaryNo);
    }

    //getter and setter
    public double getRealNo() {
        return realNo;
    }

    public void setRealNo(double realNo) {
        this.realNo = realNo;
    }

    public double getImaginaryNo() {
        return imaginaryNo;
    }

    public void setImaginaryNo(double imaginaryNo) {
        this.imaginaryNo = imaginaryNo;
    }
}


public class ComplexNo {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.display();

        Complex c1 = new Complex(2.5,6.8);
        c1.display();

        c.setRealNo(5.0);
        c.setImaginaryNo(5.6);
        System.out.println("********* Complex Number **************");
        System.out.println("Real Number : "+c.getRealNo());
        System.out.println("Imaginary Number : "+c.getImaginaryNo());
    }
}
