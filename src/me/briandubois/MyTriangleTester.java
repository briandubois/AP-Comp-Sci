package me.briandubois;

import java.util.ArrayList;

/**
 * Created by Brian DuBois on 11/23/2014.
 */
public class MyTriangleTester {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 4);
        Point c = new Point(4, 0);
        Point d = new Point(35, 64);
        Point e = new Point(3, 3 * Math.sqrt(2));
        Point f = new Point(6, 0);

        MyTriangle i = new MyTriangle(a, b, c);
        System.out.println(i);
        System.out.println("perimeter: " + i.getPerimeter());
        i.printType();

        MyTriangle s = new MyTriangle(a, b, d);
        System.out.println(s);
        System.out.println("perimeter: " + s.getPerimeter());
        s.printType();

        MyTriangle eq = new MyTriangle(a, e, f);
        System.out.println(eq);
        System.out.println("perimeter: " + eq.getPerimeter());
        eq.printType();
        ArrayList<Integer> bob = new ArrayList<Integer>();
    }
}
