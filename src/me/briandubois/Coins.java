package me.briandubois;

import java.util.*;

/*
 *@author Brian DuBois 
 */
public class Coins {
    public static void threeHeads() {
        Random rand = new Random();
        int hs = 0;
        int flips = 0;
        while (hs <= 2) {
            int side = rand.nextInt(2);
            if (side == 0) {
                hs++;
                System.out.print("H ");
            } else {
                hs = 0;
                System.out.print("T ");
            }
            flips++;
        }
        System.out.println();
        System.out.println("Three heads in a row!!!");
        System.out.println("It took " + flips + " flips.");
    }
}