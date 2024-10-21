/*

1. Payment Processing System
Problem:
Create an abstract class Payment that has an abstract method makePayment(double amount). Implement two classes CreditCardPayment and UPIPayment that extend Payment. Each of these classes should print the amount being processed and the payment type.

 */


// Abstract class Payment
abstract class Payment{
    public abstract void makePayment(double amt);
}

// CreditCardPayment class extending Payment
class CreaditCardPayment extends Payment{
    @Override
    public void makePayment(double amt) {
        System.out.println("the Make Payment Using Credit Card : "+amt+"Rs");
    }
}

// UPIPayment class extending Payment
class UPIPayment extends Payment{
    @Override
    public void makePayment(double amt) {
        System.out.println("the Make Payment Using UPI : "+amt+"Rs");
    }
}




public class PaymentSystem {
    public static void main(String[] args) {
        //objects of payment methods
        Payment cr = new CreaditCardPayment();
        Payment upi = new UPIPayment();

        //// Processing payments
        cr.makePayment(100);
        upi.makePayment(250);
    }
}
