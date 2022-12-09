
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
               System.out.print("Enter first name: ");
               String firstName = keyboard.nextLine();

               System.out.print("Enter last name: ");
               String lastName = keyboard.nextLine();

               System.out.print("Enter Social security number: ");
               String socialSecurityNumber = keyboard.nextLine();

               System.out.println("Account Name: ");
               String accountName = keyboard.nextLine();

               break;


               case 2:
               System.out.println("Option 2 is Selected. ");
               break;

               case 3:
               System.out.println("Option 3 is Selected. ");
               break;

               case 4:
               System.out.println("Option 4 is Selected. ");
               break; 

               case 5:
               System.out.println("Option 5 is Selected. ");
               break;

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
