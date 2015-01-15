package me.briandubois;

/**
 * Created by Brian on 1/14/2015.
 */
public class RecursionTracing2 {
    public static void main(String[] args) {
        String a = "wyo";
        strRecur(a);
        System.out.println();
        printString(a);
        System.out.println();
        System.out.println();
        doSomething(3);
        System.out.println();
        System.out.println();
        System.out.println(mystery(3));

    }

    public static void strRecur(String s){
        if (s.length()< 6){
            System.out.println(s);
            strRecur(s + "*");
        }
    }

    public static void printString(String s){
        if (s.length() > 0){
            printString(s.substring(1));
            System.out.print(s.substring(0,1));
        }
    }

    public static void doSomething(int n){
        if (n > 0){
            doSomething(n - 1);
            System.out.print(n);
            doSomething(n - 1);
        }
    }

    public static int mystery(int n){
        if (n < 0)
            return 2;
        else {
            System.out.println(1);
            return mystery(n - 1) + mystery(n - 3);
        }
    }
}
