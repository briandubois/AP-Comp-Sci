package me.briandubois;

import java.util.*;

/**
 * @author Brian DuBois
 */
public class Lunch {
    public static boolean enoughTimeForLunch(int hour1, int minute1, int hour2, int minute2) {
        //boolean enough = false;
        if (hour2 - hour1 > 1)
            return true;
        else if (hour2 - hour1 == 1 && minute2 + (60 - minute1) >= 45)
            return true;
        else if (hour2 == hour1 && minute2 + minute1 >= 45)
            return true;
        else
            return false;
    }
}