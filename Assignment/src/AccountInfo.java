/*
11. Encapsulation with Validation: Create a class Account with private fields
accountNumber, balance, and accountHolder. Provide getter and setter methods,
ensuring validation in the setters (e.g., balance cannot be negative).
 */
class Account{
    private int accountNumber;
    private double balance;
    private String accountHolder;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
public class AccountInfo {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountNumber(202015);
        a.setBalance(1050.39);
        a.setAccountHolder("Pranav");

        System.out.println("Account Number: "+a.getAccountNumber()+", Account Balance: "+a.getBalance()+", Account Holder: "+a.getAccountHolder());
    }
}
