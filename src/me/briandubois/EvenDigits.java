package me.briandubois;

/*
 *@author Brian DuBois 
 */
public class EvenDigits {
    public static int countEvenDigits(int a) {
        int count = 0;
        while (a > 0) {
            int digit = a % 10;
            if (digit % 2 == 0)
                count++;
            a /= 10;
        }
        return count;
    }
}