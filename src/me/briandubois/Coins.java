package me.briandubois;

import java.util.*;

/*
 *@author Brian DuBois 
 */
public class Coins {
    public static void threeHeads() {
        Random rand = new Random();

	    int numWant = 3;

        long hs = 0;
        long flips = 0;
        while ((hs + 1) <= numWant) {
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
        System.out.println(numWant + " heads in a row!!!");
        System.out.println("It took " + flips + " flips.");
    }

    public static void main(String[] args) {

        threeHeads();

    }
}