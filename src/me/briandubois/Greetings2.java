package me.briandubois;

import java.util.Scanner;

public class Greetings2 {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstName = kboard.nextLine();
        System.out.print("Enter your last name:");
        String lastName = kboard.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);
        System.out.println("Welcome to Java!");
    }
}