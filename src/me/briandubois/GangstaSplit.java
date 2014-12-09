package me.briandubois;//Brian DuBOis

import java.util.Scanner;

public class GangstaSplit {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        System.out.print("Enter your first and last name:");
        String name = kboard.nextLine();
        System.out.println("You have entered " + name);
        System.out.println("All right, all right thats ok but i can make it better! \nIt can be more... me.briandubois.Gangsta!");
        System.out.println("Here is your new, more me.briandubois.Gangsta name that you will now start using immediately:");
        String lname = name.substring(name.indexOf(" ")).toUpperCase();
        String gname = name.substring(0, 1) + ". Diddy" + lname + " " + name.substring(0, name.indexOf(" ")) + "-izzle";
        System.out.println("Now go out and smell the roses " + gname);
        kboard.close();
    }
}