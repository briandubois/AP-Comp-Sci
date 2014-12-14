package me.briandubois.ACSLWork;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Brian on 12/13/2014.
 */
public class DrivingInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Navulator, the navigational calculator. /n Please enter your specific trip details: ");
        System.out.print("Please enter your starting city: ");
        String cityFirst = scanner.next();
        System.out.print("Please enter your destination city: ");
        String cityLast = scanner.next();
        System.out.print("Please enter your type of vehicle: ");
        String vehicle = scanner.next();
        System.out.print("Please enter the type of roadway you will be traveling on: ");
        String road = scanner.next();
        System.out.print("And lastly, Please enter the current cost of gasoline per gallon: ");
        double gcost = scanner.nextDouble();
        System.out.println();
        System.out.println("Alright here are the specifics of yor trip: ");
        printSpecs(cityFirst, cityLast, vehicle, road, gcost);
    }

    public static void printSpecs(String c1, String c2, String v, String r, double gc)
    {
        System.out.println("Total Distance: " + getTotalDistance(c1,c2) + " miles.");
        System.out.println();
        System.out.print("Total Time: ");
        printTime(c1,c2,r);
        System.out.println();
        System.out.println();
        System.out.println("Total Cost: " + getCost(c1,c2,v,gc));
        System.out.println();
    }

    public static int getTotalDistance(String c1, String c2)
    {
        int[] fars = {0,450,590,710,1030,1280,1360};
        int cn1 = 0;
        int cn2 = 0;
        int distance;

        //cn1 set ups
        if (c1.equals("A")){
            cn1 = fars[0];
        }
        else if (c1.equals("B")){
            cn1 = fars[1];
        }
        else if (c1.equals("C")){
            cn1 = fars[2];
        }
        else if (c1.equals("D")){
            cn1 = fars[3];
        }
        else if (c1.equals("E")){
            cn1 = fars[4];
        }
        else if (c1.equals("F")){
            cn1 = fars[5];
        }
        else if (c1.equals("G")){
            cn1 = fars[6];
        }

        //cn2 set ups
        if (c2.equals("A")){
            cn2 = fars[0];
        }
        else if (c2.equals("B")){
            cn2 = fars[1];
        }
        else if (c2.equals("C")){
            cn2 = fars[2];
        }
        else if (c2.equals("D")){
            cn2 = fars[3];
        }
        else if (c2.equals("E")){
            cn2 = fars[4];
        }
        else if (c2.equals("F")){
            cn2 = fars[5];
        }
        else if (c2.equals("G")){
            cn2 = fars[6];
        }

        //Calculations
        distance = cn2 - cn1;
        return distance;
    }

    public static void printTime(String c1, String c2, String r)
    {
        double rideHours = 0;
        int[] roads = {65,60,55,45};

        if (r.equals("I")){
            rideHours = roads[0];
        }
        else if (r.equals("H")){
            rideHours = roads[1];
        }
        else if (r.equals("M")){
            rideHours = roads[2];
        }
        else if (r.equals("S")){
            rideHours = roads[3];
        }

        double basicHours = getTotalDistance(c1,c2)/rideHours;
        double basicMinutes = basicHours * 60;
        int hours = (int)(basicMinutes / 60);
        int minutes = (int)(basicMinutes % 60);
        System.out.printf("%d:%02d", hours, minutes);
    }

    public static String getCost(String c1, String c2, String v, double gc)
    {
        int distance = getTotalDistance(c1,c2);

        int[] cars = {28,25,22,20};
        double mpg = 0;

        if (v.equals("C")){
            mpg = cars[0];
        }
        else if (v.equals("M")){
            mpg = cars[1];
        }
        else if (v.equals("F")){
            mpg = cars[2];
        }
        else if (v.equals("V")){
            mpg = cars[3];
        }

        String tripCostPrint;
        double tripCost = ((distance / mpg) * gc);
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        tripCostPrint = numberFormat.format(tripCost);
        return "$" + tripCostPrint;
    }
}
