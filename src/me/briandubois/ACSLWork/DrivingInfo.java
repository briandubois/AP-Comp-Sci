package me.briandubois.ACSLWork;

import java.util.Scanner;

/**
 * Created by Brian on 12/13/2014.
 */
public class DrivingInfo {

    private static String cityFirst;
    private static String cityLast;
    private static String vehicle;
    private static String road;
    private static double gcost;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Navulator, the navigational calculator. /n Please enter your specific trip details: ");
        System.out.print("Please enter your starting city: ");
        cityFirst = scanner.next();
        System.out.print("Please enter your destination city: ");
        cityLast = scanner.next();
        System.out.println("Please enter your type of vehicle: ");
        vehicle = scanner.next();
        System.out.print("Please enter the type of roadway you will be traveling on: ");
        road = scanner.next();
        System.out.print("And lastly, Please enter the current cost of gasoline per gallon: ");
        gcost = scanner.nextDouble();
        System.out.println();
        System.out.println("Alright her are the specifics of yor trip: ");
        printSpecs(cityFirst, cityLast, vehicle, road, gcost);
    }

    public static void printSpecs(String c1, String c2, String v, String r, double gc)
    {
        System.out.println("Total Distance: " + getTotalDistance(c1,c2));
        System.out.println();
        System.out.println("Total Time: " + getTime(c1,c2,r));
        System.out.println();
        System.out.println("Total Cost: " + getCost(c1,c2,v,gc));
        System.out.println();
    }

    public static int getTotalDistance(String c1, String c2)
    {
        int[] fars = {0,450,590,710,1030,1280,1360};
        int cn1;
        int cn2;
        int distance;

        //cn1 set ups
        for (int )
        if (c1.equals("A")){
            cn1 = fars[1];
        }
        else if (c1.equals("B")){
            cn1 = fars[2];
        }
        else if (c1.equals("C")){
            cn1 = fars[3];
        }
        else if (c1.equals("D")){
            cn1 = fars[4];
        }
        else if (c1.equals("E")){
            cn1 = fars[5];
        }
        else if (c1.equals("F")){
            cn1 = fars[6];
        }
        else if (c1.equals("G")){
            cn1 = fars[7];
        }

        //cn2 set ups
        if (c2.equals("A")){
            cn2 = fars[1];
        }
        else if (c2.equals("B")){
            cn2 = fars[2];
        }
        else if (c2.equals("C")){
            cn2 = fars[3];
        }
        else if (c2.equals("D")){
            cn2 = fars[4];
        }
        else if (c2.equals("E")){
            cn2 = fars[5];
        }
        else if (c2.equals("F")){
            cn2 = fars[6];
        }
        else if (c2.equals("G")){
            cn2 = fars[7];
        }

        //Calculatios
        distance = cn2 - cn1;
        return distance;
    }

    public static String getTime(String c1, String c2, String r)
    {

    }

    public static String getCost(String c1, String c2, String v, double gc)
    {

    }
}
