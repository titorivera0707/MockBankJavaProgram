

public class Interface {

    //Creating variables for the classes that have been created.
    private int accountNumber;
    private static int accountCounter = 1000;
    private Person accHolder;
    private Account bankAccount;
    private int balance;

    public Interface(Person accHolder, Account bankAccount){

        super();
        this.balance = balance;
        this.accountNumber = accountCounter++;
        this.accHolder = accHolder;
        this.bankAccount = bankAccount;

    }

    //Setting getters and setters.
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountCounter() {
        return accountCounter;
    }
    public void setAccountCounter(int accountCounter) {
        this.accountCounter = accountCounter;
    }
    public Person getAccHolder() {
        return accHolder;
    }
    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }
    public Account getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(Account bankAccount) {
        this.bankAccount = bankAccount;
    }

    //Creates a string to call whenever full account information is requested.
    public String toString() {

        return getAccountNumber() + " " + accHolder.toString() + " : " + getBalance() + " : Account - " + bankAccount.getAccountStatus();

    }

}