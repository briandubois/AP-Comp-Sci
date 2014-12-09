package me.briandubois;

import java.util.Scanner;

//me.briandubois.BAWInput- BankAcountWithInput
public class BAWInput {
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        BankAccount1 b1 = new BankAccount1(500);

        System.out.print("How much would you like to deposit?");
        Double iN = kboard.nextDouble();
        b1.Deposit(iN);

        System.out.print("How much would you like to withdraw?");
        Double ouT = kboard.nextDouble();
        b1.Withdrawal(ouT);

        System.out.println("You have $" + b1.getBalance());

        System.out.println("Thank you for your service, please come again.");

    }
}
 