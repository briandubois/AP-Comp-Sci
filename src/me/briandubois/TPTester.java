package me.briandubois;//Brian DuBois

public class TPTester {
    public static void main(String[] args) {
        ThePoint p1 = new ThePoint();
        ThePoint p2 = new ThePoint(4, 4);

        //me.briandubois.Point #1
        System.out.println("Your first point is currently:");
        System.out.print(p1.getX() + ", ");
        System.out.println(p1.getY());

        System.out.println("... Changing location...");
        p1.setLocation(3, 5);
        System.out.println("Your point has been changed to: (" + p1.getX() + "," + p1.getY() + ")");

        System.out.println("... Translating...");
        p1.translate(3, 1);
        System.out.println("Your point has been changed to: (" + p1.getX() + "," + p1.getY() + ")");

        System.out.println("The distance of your point from the origin is: " + p1.dist());


        System.out.println(" ");


        //me.briandubois.Point#2
        System.out.println("Your second point is currently:");
        System.out.print(p2.getX() + ", ");
        System.out.println(p2.getY());

        System.out.println("... Changing location...");
        p2.setLocation(12, 2);
        System.out.println("Your point has been changed to: (" + p2.getX() + "," + p2.getY() + ")");

        System.out.println("... Translating...");
        p2.translate(-7, 1);
        System.out.println("Your point has been changed to: (" + p2.getX() + "," + p2.getY() + ")");

        System.out.println("The distance of your point from the origin is: " + p2.dist());

    }
}