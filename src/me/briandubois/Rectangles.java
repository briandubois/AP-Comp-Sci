package me.briandubois;

import java.util.*;

/**
 * @author Brian DuBois
 */
public class Rectangles {
    public static void randomRects() {
        Random rand = new Random();
        int lastArea = 0;
        int count = 0;
        int rectangles = 0;
        while (count < 3) {
            int w = rand.nextInt(10) + 1;
            int h = rand.nextInt(10) + 1;
            int area = w * h;
            System.out.println("w: " + w + ", h: " + h + ", area: " + area);
            if (area > lastArea)
                count++;
            else
                count = 0;
            lastArea = area;
            rectangles++;
        }
        System.out.println("Four rectangles with increasing area!");
        System.out.println("The genie in your computer made " + rectangles + " rectangles");
    }
}
