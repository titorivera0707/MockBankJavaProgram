//Pedro Nunez pnunez14@toromail.csudh.edu
//Tito Rivera trivera26@toromail.csudh.edu

public class Interface {
      
    //Creating variables for the classes that have been created.
 private int accountNumber;
 private static int accountCounter = 1000;
 private Person accHolder;
 private double balance;
 private String accountStat;

 public Interface(Person accHolder){

     super();
     this.balance = balance;
     this.accountNumber = accountCounter++;
     this.accHolder = accHolder;
     this.accountStat = accountStat;

 }

 //Setting getters and setters.
 public String getAccountStatus() {
    return accountStat;
}
public void setAccountStatus(String accountStat) {
    this.accountStat = accountStat;
}
 public double getBalance() {
     return balance;
 }
 public void setBalance(double balance) {
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

 //Creates a string to call whenever full account information is requested.
 public String toString() {

     return +getAccountNumber() + "" + accHolder.toString() + " : " + getBalance() + " : Account - " + getAccountStatus().toString()+" "; 
     

 }

}