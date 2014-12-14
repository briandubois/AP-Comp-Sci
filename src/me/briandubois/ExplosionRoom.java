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
        System.out.printf("%d:%02d", hours, minutes);*/
        double t = 6.75 * 60;
        int hours = (int)(t / 60); //since both are ints, you get an int
        int minutes = (int)(t % 60);
        System.out.printf("%d:%02d", hours, minutes);
    }
}
