package me.briandubois;

/**
 * @author Brian DuBois
 */
public class Sames {
    public static int consecutiveDigits(int number) {
        int[] counts = new int[10];
        int lastdigit = 20;
        while (number > 0) {
            int digit = number % 10;
            if (digit == lastdigit)
                counts[digit]++;
            lastdigit = digit;
            number /= 10;
        }
        int highIndex = 0;
        for (int j = 0; j < 10; j++) {
            if (counts[j] > counts[highIndex])
                highIndex = j;
        }
        return counts[highIndex] + 1;
    }
}