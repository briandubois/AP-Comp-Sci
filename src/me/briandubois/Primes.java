package me.briandubois;

import java.util.Scanner;

public class Primes {
    public static void printPrimes(int max) {
        if (max >= 2) {
            System.out.print("The me.briandubois.Primes are: 2");
            for (int i = 3; i <= max; i++) {
                if (isPrime(i)) {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
    }

    // Returns how many factors the given number has.
    public static boolean isPrime(int lick) {
        for (int j = 2; j < lick; j++) {
            if (lick % j == 0) return false;
        }
        return true;
    }

    public static void Factorial(int hi) {
        int answer = 1;
        for (int j = 1; j <= hi; j++) {
            answer *= j;
        }
        System.out.println("Factorial answer is: " + answer);
    }

    public static void Power(int a, int b) {
        int answer = 1;
        for (int j = 1; j <= b; j++) {
            answer *= a;
        }
        System.out.println(a + "^" + b + "= " + answer);
    }

    public static void main(String[] args) {
        printPrimes(100000);
        //My comp: in 57.94, School comp: 1:33
        Factorial(31);
        //Breaks after 31
        Power(19, 17);
        //All maxxed out
    }
}

 