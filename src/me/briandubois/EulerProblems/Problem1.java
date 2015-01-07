package me.briandubois.EulerProblems;

/**
 * Created by Brian on 1/7/2015.
 */
public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        System.out.println(sum);
    }
}
