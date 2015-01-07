package me.briandubois.EulerProblems;

/**
 * Created by Brian on 1/7/2015.
 */
public class Problem2 {
    public static void main(String[] args) {
        int last = 1;
        int prev = 0;
        int current;
        int sum = 0;
        for (int i = 1; i <= 4000000; i = current){
            current = last + prev;
            last = prev;
            prev = current;
            System.out.println(i);
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("\n" + sum);
    }
}
