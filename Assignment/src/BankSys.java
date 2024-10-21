/*
8. Method Overriding: Create a base class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount and CurrentAccount that override the calculateInterest() method with their specific implementations.
 */
class BankAccount{
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest(){
        System.out.println("calculate interest for the generic bank account ");
        return 0;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        double interest = balance * interestRate/100;
        System.out.println("calculate interest for saving account : "+interest);
        return interest;
    }
}

class CurrentAccount extends BankAccount{
    private double serviceCharge;

    public CurrentAccount(double balance, double serviceCharge) {
        super(balance);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateInterest() {
        System.out.println("no interest for current account, but service charge applies : "+serviceCharge);
        return -serviceCharge;
    }
}

public class BankSys {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(2050);
        ba.calculateInterest();

        SavingsAccount sa = new SavingsAccount(2010,5);
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount(1010,5);
        ca.calculateInterest();

    }
}
