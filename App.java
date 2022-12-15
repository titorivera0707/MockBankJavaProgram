//Pedro Nunez pnunez14@toromail.csudh.edu
//Tito Rivera trivera26@toromail.csudh.edu

import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Person person = new Person(null, null, null, null, null);
        Account newAccount = new Account(0.0, null);

        //accept menu method
        int userSelect;
        do{
            //accessing the menu in this switch statement

            Scanner input = new Scanner(System.in);

            //A list of options for the user
            System.out.println("1 - Open Account");
            System.out.println("2 - List Accounts");
            System.out.println("3 - Deposit funds");
            System.out.println("4 - Withdraw funds");
            System.out.println("5 - Close an account");
            System.out.println("6 - Exit");

            //Asking user to pick an option to start the program
            System.out.print("\nHello, welcome to CS Bank and Trust. \nPlease enter your choice: ");
            userSelect = input.nextInt();

            //each case is equlivent to each number choice in the menu
            switch(userSelect) {
               case 1:
               Interface in = Bank.bankInterface(person, newAccount);

               System.out.print("\nEnter first name: ");
               person.setFirstName(keyboard.nextLine());

               System.out.print("Enter last name: ");
               person.setLastName(keyboard.nextLine());

               System.out.print("Enter Social security number: ");
               person.setSSN(keyboard.nextLine());

               System.out.print("Account Name: ");
               person.setAccountName(keyboard.nextLine());

               newAccount.setAccountStatus("Open");

               System.out.println("Thank you, the account number is: " +in.getAccountNumber()+".\n");
               break;
               
               case 2:
               Bank.list();
               System.out.println("\n");
               break;
               
               case 3:
               
               System.out.print("\nEnter account number: ");
               int searchString = keyboard.nextInt();

               if(Bank.search(searchString) == null) {
                  System.out.println("Account not found");
                  break;
               }

               if(newAccount.getAccountStatus().equalsIgnoreCase("Closed")) {
                  System.out.println("Account closed. Only withdraw allowed. Please use another account.");
                  break;
               }


               System.out.print("Enter the amount to deposit: ");
               double newDep = keyboard.nextDouble();
               Bank.depos(searchString, newDep);
               Bank.find(searchString);
               System.out.print("Deposit successful, the new balance is: " + Bank.find(searchString) + "\n");
               
               break;
               

               case 4:

               System.out.print("\nEnter account number: ");
               int accountNum = keyboard.nextInt();

               if(Bank.search(accountNum) == null) {
                  System.out.println("Account not found");
                  break;
               }

               System.out.print("Enter the amount to withdraw: ");
               double Withdraw = keyboard.nextDouble();

               if (Bank.find(accountNum) < Withdraw) {
                  System.out.println("You can't withdraw more than you have. Try again.");
                  break;
               }
               else{
                  Bank.withd(accountNum, Withdraw);
               }

               if(Bank.find(accountNum)==0) {
                  System.out.print("Account not found ");
               }
               else{
               Bank.find(accountNum);
               System.out.print("Withdraw successful, the new balance is: $" + Bank.find(accountNum) + "\n");
               }
               break;
               
               case 5:
               System.out.print("\nEnter account number to close: ");
               int accNumber = keyboard.nextInt();

               if(Bank.search(accNumber) == null) {
                  System.out.println("Account not found");
                  break;
               }
               else if(newAccount.getAccountStatus().equalsIgnoreCase("Closed")) System.out.println("Account already closed.");
               else {
                  newAccount.setAccountStatus(Bank.search(accNumber));
                  System.out.println("Account closed, current balance is "+Bank.find(accNumber)+" deposits are no longer possible");
               }
               break;

               case 6:
               System.exit(0);
               break;

               default:
               break;
            }

        //Error checking incase user uses invalid numbers.
        } while(userSelect > 0 && userSelect < 7);

     }

}
