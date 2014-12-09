package me.briandubois.ArrayListPractice;

import java.util.ArrayList;

/**
 * Created by Brian on 12/8/2014.
 */
public class ArrayListCapPlurals {
    public static void capitalizePlurals(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).endsWith("s")) {
                a.set(i, (a.get(i).substring(0, 1).toUpperCase() + a.get(i).substring(1)));
            }
        }
    }
}
