

public class Account {

    private int accountNumber;
    private static int accountCounter = 1000;
    private double balance;
    private String accountStatus;

    public Account(int accountNumber, double balance, String accountStatus) {
        this.accountNumber = accountCounter++;
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public static int getAccountCounter() {
        return accountCounter;
    }
    public static void setAccountCounter(int accountCounter) {
        Account.accountCounter = accountCounter;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String toString() {
        return " : " + accountNumber + " : " + balance + " : " + accountStatus;
    }

}