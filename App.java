//Pedro and Tito's project
import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Declaring the userNumber variable that will hold users choice
        int userNumber = 0;

        while(userNumber != 6) {

            //Asking user to choose an option to begin program.
            System.out.println("\n Hello, welcome to CS Bank and Trust. \n\n Please choose an option.");
            System.out.println("1 - Open Account\n2 - List Accounts\n3 - Deposit Funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
            System.out.println("Please enter your choice: ");
            userNumber = keyboard.nextInt();

            //Error checking incase user uses invalid numbers.
            while(userNumber < 1 || userNumber > 6) {
                System.out.println("Please use a valid number 1-6: ");
                userNumber = keyboard.nextInt();
            }

            //Begin using if - else statements in order to gain functionality.

        }

    }

}