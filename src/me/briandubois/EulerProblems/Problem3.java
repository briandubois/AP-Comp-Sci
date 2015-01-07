package me.briandubois.EulerProblems;

/**
 * Created by Brian on 1/7/2015.
 */
public class Problem3 {
    public static void main(String[] args) {
        //int numbah = 600851475143;
    }

    /*
    unable to do -_-
     */

    public static boolean isPrime(int lick) {
        for (int j = 2; j < lick; j++) {
            if (lick % j == 0) return false;
        }
        return true;
    }
}
