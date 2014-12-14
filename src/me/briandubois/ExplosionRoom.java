package me.briandubois;

/**
 * Created by Brian on 12/14/2014.
 */
public class ExplosionRoom {
    public static void main (String[] args)
    {
        /*int minutes = 0;
        double t = 97.54627;
        int hours = (int)(t); //since both are ints, you get an int
        if (hours > 10){
          minutes = (int)((t % 100)*60);
        } else {
          minutes = (int)((t % 10)*60);
        }
        System.out.printf("%d:%02d", hours, minutes);
      double t = 6.75 * 60;
      int hours = (int)(t / 60); //since both are ints, you get an int
      int minutes = (int)(t % 60);
      System.out.printf("%d:%02d", hours, minutes);*/
        System.out.println(getCost("A","C","M",3.79));
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

    public static String getCost(String c1, String c2, String v, double gc)
    {
        int distance = getTotalDistance(c1,c2);
        System.out.println(distance);

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

        double tripCost = (distance / mpg * gc);
        System.out.println(distance/mpg);
        return "$" + tripCost;
    }
}
