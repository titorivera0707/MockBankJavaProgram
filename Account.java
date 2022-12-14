

public class Account {

    //Declaring all private variables for this class only.
    private String accountStatus;

    public Account(int balance, String accountStatus) {
        this.accountStatus = accountStatus;
    }
    public String getAccountStatus() {
        return accountStatus;
    }
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    //Converting the entire account information to string format.
    public String toString() {
        return " : " + accountStatus +"\n";
    }

}