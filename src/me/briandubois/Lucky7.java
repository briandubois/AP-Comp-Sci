package me.briandubois;

import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {
        int tries = 0;
        int sum = 0;

        Random r = new Random();

        while (sum != 7) {
            int dig1 = r.nextInt(6) + 1;
            int dig2 = r.nextInt(6) + 1;
            sum = dig1 + dig2;
            tries++;
            System.out.println(dig1 + " + " + dig2 + " = " + sum);
        }
        System.out.println("Congrats you won in " + tries + " tries!");
    }
}