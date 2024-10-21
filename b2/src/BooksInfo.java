/*
3. Create a class Book with data members as bname,id,author,price. Write getters and setters for all the data members. Also add the display function. Create Default and Parameterized constructors. Create the object of this class in main method and invoke all the methods in that class.
 */

class Book{
    private String bName;
    private int bId;
    private String bAuthor;
    private double bPrice;


    public Book() {
        this.bId = 10;
        this.bName = "C++ & DSA";
        this.bAuthor = "P Mahajan";
        this.bPrice = 1050.30;
    }

    public Book(int bId, String bName, String bAuthor, double bPrice) {
        this.bName = bName;
        this.bId = bId;
        this.bAuthor = bAuthor;
        this.bPrice = bPrice;
    }

    public void display(){
        System.out.println("************************ Book Details *****************************");
        System.out.println("Book Id ; "+bId);
        System.out.println("Book Name : "+bName);
        System.out.println("Book Author : "+bAuthor);
        System.out.println("Book Price : "+bPrice);
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }
}


public class BooksInfo {
    public static void main(String[] args) {

        //Constructor is assign the value in the class
        Book b = new Book(11,"C Program", "Dennis R.",1000);
        b.display();

        //getter and setter is assign the value
        b.setbId(12);
        b.setbName("Algorithm");
        b.setbAuthor("Pranav M.");
        b.setbPrice(1020);
        System.out.println("************ Book Details Using Getter And Setter *************");
        System.out.println("Book Id ; "+b.getbId());
        System.out.println("Book Name : "+b.getbName());
        System.out.println("Book Author : "+b.getbAuthor());
        System.out.println("Book Price : "+b.getbPrice());

    }
}
