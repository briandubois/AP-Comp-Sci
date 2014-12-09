package me.briandubois;

import java.util.*;

/**
 * @author Brian DuBois
 */
public class Student {
    //data
    private int test1;
    private int test2;
    private String studentName;

    //constructor
    public Student(String studentName) {
        test1 = 0;
        test2 = 0;
        this.studentName = studentName;
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + studentName + "'s score for test 1:");
        test1 = scanner.nextInt();
        System.out.print("Enter " + studentName + "'s score for test 2:");
        test2 = scanner.nextInt();
        scanner.close();
    }

    public double getAverage() {
        double average = (double) (test1 + test2) / 2;
        return average;
    }

    public String printName() {
        return this.studentName;
    }

    public String toString() {
        return ("Name: " + studentName + " Test 1: " + test1 + " Test 2: " + test2);
    }
}