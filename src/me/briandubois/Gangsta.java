package me.briandubois;//Brian DuBOis

import java.util.Scanner;

public class Gangsta {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        System.out.print("Enter your first and last name:");
        String fname = kboard.next();
        String lname = kboard.next();
        System.out.println("You have entered " + fname + " " + lname);
        System.out.println("Alright, alright thats ok but i can make it better! \nIt can be more... me.briandubois.Gangsta!");
        System.out.println("Here is your new, more me.briandubois.Gangsta name that you will now start using immediately:");
        String gname = (fname.substring(0, 1) + ". " + "Diddy " + lname.toUpperCase() + " " + fname + "-izzle");
        System.out.println(gname);
        System.out.println("Now go out and smell th roses " + gname);
        kboard.close();
    }
}