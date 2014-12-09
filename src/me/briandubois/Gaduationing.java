package me.briandubois;

import java.util.*;

/*
 *@author Brian DuBois 
 */
public class Gaduationing {
    public static void graduation(double a, int b, int c) {
        double gpa = a;
        int creds = b;
        int honors = c;

        boolean gpayes1 = false;
        boolean gpayes2 = false;
        boolean gpayes3 = false;

        if (gpa >= 3.8)
            gpayes1 = true;
        else if (gpa >= 3.6)
            gpayes2 = true;
        else if (gpa >= 2.0)
            gpayes3 = true;

        boolean credsyes1 = false;

        if (creds >= 180)
            credsyes1 = true;

        boolean honorsyes1 = false;

        if (honors >= 15)
            honorsyes1 = true;

        if (gpayes1 && credsyes1 && honorsyes1)
            System.out.println("Summa cum laude");
        else if (gpayes2 && credsyes1 && honorsyes1)
            System.out.println("Magna cum laude");
        else if (gpayes1 && credsyes1)
            System.out.println("Magna cum laude");
        else if (gpayes2 && credsyes1)
            System.out.println("Cum laude");
        else if (gpayes3)
            System.out.println("Graduating");
        else
            System.out.println("Not graduating. Sry dude(et)");
    }
}