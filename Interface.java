

public class Interface {

    //Creating variables for the classes that have been created.
    private Person accHolder;
    private Account bankAccount;

    public Interface(Person accHolder, Account bankAccount){

        super();
        this.accHolder = accHolder;
        this.bankAccount = bankAccount;

    }

    //Setting getters and setters.
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

        return bankAccount.getAccountNumber() + " " + accHolder.toString() + " : " + bankAccount.getBalance() + " : Account" + bankAccount.getAccountStatus().toString();

    }

}