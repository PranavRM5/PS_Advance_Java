/*
3. Interface Example: Define an interface Payment with a method makePayment(). Implement this interface in classes CreditCardPayment and CashPayment. Test these classes by calling the makePayment() method.
 */
interface Payment{
    void makePayment();
}

class CreditCardPayment implements Payment{
    private double amt;

    public CreditCardPayment(double amt) {
        this.amt = amt;
    }

    @Override
    public void makePayment() {
        System.out.println("Make Payment using credit card. "+amt);
    }
}
class CashPayment implements Payment{
    private double amt;

    public CashPayment(double amt) {
        this.amt = amt;
    }

    @Override
    public void makePayment() {
        System.out.println("Make Payment using cash payment.  "+amt);
    }
}

public class PaymentMeth {
    public static void main(String[] args) {
        Payment ccp = new CreditCardPayment(10);
        System.out.println("\nCredit Card Payment : ");
        ccp.makePayment();

        Payment cp = new CashPayment(20);
        System.out.println("\nCash Payment : ");
        cp.makePayment();
    }
}
