
//Pedro and Tito's project
import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //accept menu method
        int userSelect;
        do{
            //accessing the menu in this switch statement
            userSelect = menu();

            //each case is equlivent to each number choice in the menu
            switch(userSelect) {
               case 1:
               Person person = new Person(null, null, null, null, null);
               System.out.print("\nEnter first name: ");
               person.setFirstName(keyboard.nextLine());

               System.out.print("Enter last name: ");
               person.setLastName(keyboard.nextLine());

               System.out.print("Enter Social security number: ");
               person.setSSN(keyboard.nextLine());

               System.out.print("Account Name: ");
               person.setAccountName(keyboard.nextLine());

               Interface in = Bank.bankInterface(person, null);

               System.out.println("Thank you, the account number is: " +in.getAccountNumber()+".\n");
               menu();
               

               case 2:
               System.out.println(Bank.getAll());
               break;

               case 3:
               System.out.println("\nOption 3 is Selected. \n");
               menu();
               

               case 4:
               System.out.println("\nOption 4 is Selected. \n");
               menu();
               

               case 5:
               System.out.println("\nOption 5 is Selected. \n");
               menu();
               

               case 6:
               System.exit(0);
               break;

               default:
               break;
            }

        //Error checking incase user uses invalid numbers.
        } while(userSelect < 1 || userSelect > 6);

     }

     public static int menu() {
        int selection;
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
        selection = input.nextInt();
        return selection;
       
     }
}
