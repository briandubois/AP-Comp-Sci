package me.briandubois;

import java.util.Scanner;
import java.util.Arrays;

public class tempDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numdays = 0;
        int sum = 0;
        int daysov = 0;
        System.out.print("Enter the number of days: ");
        numdays = console.nextInt();
        int[] temps = new int[numdays];
        System.out.print("Enter the highest temperature for each day");
        for (int j = 0; j < numdays; j++) {
            System.out.print("Enter your temperature for Day " + (j + 1));
            temps[j] = console.nextInt();
            sum += temps[j];

        }
        int avrg = sum / numdays;
        System.out.println("Good");
        System.out.println("The average temperate for all of the days is " + avrg + "");
        for (int j = 0; j < numdays; j++) {
            if (temps[j] > avrg) {
                daysov++;
            }
        }
        if (daysov == 1) {
            System.out.println("Out of " + numdays + " days, one day was over the average temperature.");
        } else {
            System.out.println("Out of " + numdays + " days, " + daysov + " were over the average temperature.");
        }
        System.out.println();
        System.out.println("Your temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[numdays - 2] + ", " + temps[numdays - 1]);


        console.close();
    }
}