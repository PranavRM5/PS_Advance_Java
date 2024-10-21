/*
4:Create java application for bank account handling.
4.1. Create a class BankAccount -- acct no(int),customer name(string),balance(double)
 constr  to accept all details

4.2 Add Business logic methods
Methods
public void withdraw(double amt)
public void deposit(double amt)

4.3:Create TestAccount class...Create object of account class and test withdraw and deposit methods.
 */

class BankAccount{
    private int acct_no;
    private String customer_name;
    private double balance;

    //Constructor for the assign the value
    public BankAccount(int acct_no, String customer_name, double balance) {
        this.acct_no = acct_no;
        this.customer_name = customer_name;
        this.balance = balance;
    }

    //Method for the display the customer details
    public void customerAccountDetails(){
        System.out.println("The Bank Customer Account No : "+acct_no+" \nCustomer Name: "+customer_name+" \nCustomer Balance : " +balance);
    }

    //Method for the withdraw the amount
    public void withdraw(double amt){
        if (amt>balance)
        {
            System.out.println("Insufficient Balance! Withdraw failed ");
        }
        else
        {
            balance -= amt;
            System.out.println("Successfully Withdrew! : "+amt);
        }
    }

    //Method for the deposite the amount
    public void deposite(double amt){
        if (amt<=0)
        {
            System.out.println("Invalid Deposite Ammount!");
        }
        else
        {
            balance += amt;
            System.out.println("Successfully Deposited : "+amt);
        }

    }

}



public class TestAccount {
    public static void main(String[] args) {


        System.out.println("\n*************** Initialize Bank Details **********************");
        BankAccount ba = new BankAccount(10203,"pranav", 1000);
        ba.customerAccountDetails();


        System.out.println("\n************ Deposite the funds ****************");
        ba.deposite(1000);
        System.out.println();
        ba.customerAccountDetails();

        System.out.println("\n************ Withdraw the funds ****************");
        ba.withdraw(1000);
        System.out.println();
        ba.customerAccountDetails();


    }
}

