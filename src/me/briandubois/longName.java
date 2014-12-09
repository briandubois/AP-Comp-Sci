package me.briandubois;

import java.util.*;

/*
 *@author Brian DuBois 
 */
public class longName {
    public static void longestName(Scanner console, int n) {
        int numNames = n;
        boolean tie = false;

        String[] names = new String[numNames];
        System.out.println("Enter the " + numNames + " names:");
        for (int j = 0; j < numNames; j++) {
            System.out.print("Name #" + (j + 1) + "?");
            names[j] = console.next();
        }

        String longest = names[0];
        for (int j = 0; j < numNames; j++) {
            if (names[j].length() > longest.length()) {
                longest = names[j];
            }
        }
        for (int j = 0; j < numNames; j++) {
            if (names[j].length() == longest.length() && !names[j].equals(longest)) {
                tie = true;
            }
        }

        String lname = longest.toString();
        lname = lname.toLowerCase();
        System.out.println("The longest name is..." + lname.substring(0, 1).toUpperCase() + lname.substring(1) + "!!!");
        if (tie) {
            System.out.println("        (with a tie)");
        }
        console.close();
    }
}
