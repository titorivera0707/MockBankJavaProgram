//Pedro Nunez pnunez14@toromail.csudh.edu
//Tito Rivera trivera26@toromail.csudh.edu

import java.util.*;
import java.io.*;

public class Bank {
     

    //Creating an ArrayList in order to be able to display all bank accounts.
    private static ArrayList<Interface> inter = new ArrayList<Interface>(); 

    //Used in order to add new items into the ArrayList every time something is pushed.
    public static Interface bankInterface(Person accHolder) {

        Interface in = new Interface(accHolder);
        inter.add(in);

        return in;

    }

    //Used to set account status of an account.
    public static Interface setStat (int accountNum, String newS) {

        for (Interface in: inter) {
            if(in.getAccountNumber() == accountNum) {

                in.setAccountStatus(newS);;

            }
        }

        return null;

    }

    //Used to get account status of an account.
    public static String getStat (int accountNum) {

        for (Interface in: inter) {
            if(in.getAccountNumber() == accountNum) {

                return in.getAccountStatus();

            }
        }

        return null;

    }

    //Adds money into the Balance variable using the account number.
    public static Interface depos (int accountNum, double newBalance) {

        for (Interface in: inter) {
            if(in.getAccountNumber() == accountNum) {

                in.setBalance(in.getBalance() + newBalance);

            }
        }

        return null;

    }

    //Takes away money from the Balance variable.
    public static Interface withd (int accountNum, double newBalance) {

        for (Interface in: inter) {
            if(in.getAccountNumber() == accountNum) {

                in.setBalance(in.getBalance() - newBalance);

            }
        }

        return null;

    }

    //Used in order to list the amount of items inside of the ArrayList when called.
    public static void list() {
        for(Interface in: inter) {
            System.out.println(in);
        }
    }

    //If account number matches an account number in ArrayList will return "Closed".
    public static String search(int accountNum) {

        for(Interface r: inter) {
            if(accountNum == r.getAccountNumber()) return "Closed";
            
        }

        return null;

    }

    //used in order to get the exact balance in a certain account. 
    public static double find(int accountNum) {

        for(Interface in: inter) {
            if(in.getAccountNumber() == accountNum) return in.getBalance();
        }

        return 0;

    }

    //Used in order to list everything inside of the ArrayList.
    public static String getAll() {
        return inter.toString();
    }
}