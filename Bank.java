import java.util.*;
import java.io.*;

public class Bank {

    //Creating an ArrayList in order to be able to display all bank accounts.
    private static ArrayList<Interface> inter = new ArrayList<Interface>(); 

    //Used in order to add new items into the ArrayList every time something is pushed.
    public static Interface bankInterface(Person accHolder, Account bankAccount) {

        Interface in = new Interface(accHolder, bankAccount);
        inter.add(in);

        return in;

    }

    //Used in order to list the amount of items inside of the ArrayList when called.
    public static void list() {
        for(Interface in: inter) {
            System.out.println(in);
        }
    }

    //used in order to find a specific account using the account number.
    public static Interface find(int accountNum) {

        for(Interface in: inter) {
            if(in.getAccountNumber() == accountNum) return in;
        }

        return null;

    }

    //Used in order to list everything inside of the ArrayList.
    public static String getAll() {
        return inter.toString();
    }

}