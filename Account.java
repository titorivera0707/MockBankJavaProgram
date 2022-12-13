

public class Account {

    //Declaring all private variables for this class only.
    private int balance;
    private String accountStatus;

    public Account(int balance, String accountStatus) {
        this.balance = balance;
        this.accountStatus = accountStatus;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    //Converting the entire account information to string format.
    public String toString() {
        return " : " + balance + " : " + accountStatus;
    }

}