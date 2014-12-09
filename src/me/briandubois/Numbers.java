package me.briandubois;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int score = 0;
        int fails = 0;
        Random r = new Random();

        while (fails < 3) {
            int digits = r.nextInt(4) + 2;
            int sum = 0;

            for (int jesus = 1; jesus <= digits; jesus++) {
                int buddha = r.nextInt(4) + 1;
                if (jesus == digits) {
                    System.out.print(buddha + " = ");
                } else {
                    System.out.print(buddha + " + ");
                }
                sum += buddha;
            }

            int answer = console.nextInt();
            if (answer == sum) {
                score++;
            } else {
                System.out.println("Incorrect! The answer is " + sum);
                fails++;
            }

        }
        // 0 1-3 4-6 7-9 10
        if (score == 0) {
            System.out.print("You have the intelegence of an unintellectual premature badger!!");
        } else if (score <= 3) {
            System.out.print("Go back to first grade!");
        } else if (score <= 6) {
            System.out.print("Alright thats almost meh.");
        } else if (score <= 9) {
            System.out.print("Thats the okayest I've seen in a while");
        } else if (score <= 50) {
            System.out.print("Wow you have done pretty well!");
        } else {
            System.out.print("OMG you ar a freaking math ninja wizard!!!!!!!");
        }
        System.out.println(" Your final score is " + score + "!");
        console.close();
    }
}