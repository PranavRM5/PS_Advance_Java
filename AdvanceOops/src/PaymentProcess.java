/*
5.
Problem: Define an interface PaymentProcessor with a method processPayment(double amount). Implement two classes CreditCardPayment and PayPalPayment that implement this interface. Demonstrate polymorphism by creating a method that accepts PaymentProcessor as a parameter and processes payments without knowing the concrete class in advance.

Expected Outcome: The same method should be able to process both CreditCardPayment and PayPalPayment types using polymorphism.
 */

interface PaymentProcessor{
    void processPayment(double amount);
}
class CreditCardPayment implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment using credit card is "+amount);
    }
}
class PayPalPayment implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment using PayPal Payment system is "+amount);
    }
}



public class PaymentProcess {

    public static void processTransaction(PaymentProcessor pp, double amount){
        pp.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor ccp = new CreditCardPayment();
        PaymentProcessor ppp = new PayPalPayment();


        System.out.println("\n********** Credit card transaction ********");
        processTransaction(ccp,1000);

        System.out.println("\n********** PayPal transaction ********");
        processTransaction(ppp,500);
    }

}
