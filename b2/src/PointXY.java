/*
4. Create a class Point with data members as x,y. Create Default and Parameterized constructors. Write getters and setters for all the data members. Also add the display function. Create the object of this class in main method and invoke all the methods in that class.
 */

class Point{
    private int x;
    private int y;

    //Default constructors
    public Point() {
        this.x = 10;
        this.y = 20;
    }

    //Parameterized constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //display function method
    public void display(){
        System.out.println("*********** Point **********");
        System.out.println("The Point X : "+x);
        System.out.println("The Point Y : "+y);
    }

    //getter and setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class PointXY {
    public static void main(String[] args) {
        //default value
        Point p = new Point();
        p.display();

        //parameterized value
        Point p1 = new Point(11,22);
        p1.display();

        //getter and setter value
        p.setX(100);
        p.setY(200);
        System.out.println("*********** Point **********");
        System.out.println("The Point X : "+p.getX());
        System.out.println("The Point Y : "+p.getY());

    }
}
