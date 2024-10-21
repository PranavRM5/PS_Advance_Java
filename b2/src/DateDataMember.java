/*
2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. Also add the display function. Create Default and Parameterized constructors. Create the object of this class in main method and invoke all the methods in that class.
 */

class Date{
    private int dd;
    private int mm;
    private int yy;

    //Default constructors
    public Date() {
        this.dd = 01;
        this.mm = 01;
        this.yy = 10;
    }

    //Parameterized constructors
    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public void displayDate(){
        System.out.println("Date : "+dd+"/"+mm+"/"+yy);
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

}



public class DateDataMember {
    public static void main(String[] args) {
        Date df = new Date();
        df.displayDate();

        //Date print using constructor and the display function
        Date d = new Date(28,12,25);
        d.displayDate();

        //date print using getter and setter
        d.setDd(30);
        d.setMm(11);
        d.setYy(25);
        System.out.println("Date : "+ d.getDd()+"/"+d.getMm()+"/"+ d.getYy());
    }
}
