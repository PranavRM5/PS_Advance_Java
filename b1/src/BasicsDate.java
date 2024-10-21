import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class LDate{
    //Setup of the Date and their format
    public String setDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String text = date.format(formatter);
        return text;
    }
    //print the date
    public void displayDate(String d){
        System.out.println(d);
    }
}

public class BasicsDate {
    public static void main(String[] args) {
//        2:Create Date Class with Data Members day,month, year
//        2.1:Create an object and initialize it using setDate methods and display it using
//        displayDate methods.
        //LDate is Object
        LDate d = new LDate();
        String date = d.setDate();

        //Display the date
        d.displayDate(date);
    }
}
