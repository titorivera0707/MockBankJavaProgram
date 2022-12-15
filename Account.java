//Pedro Nunez pnunez14@toromail.csudh.edu
//Tito Rivera trivera26@toromail.csudh.edu

public class Account {
    
    private String accountStatus;

    public Account(double balance, String accountStatus) {
        
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
        return " : " + accountStatus;
    }

}