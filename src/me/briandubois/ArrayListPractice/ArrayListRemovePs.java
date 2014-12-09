package me.briandubois.ArrayListPractice;

import java.util.ArrayList;

/**
 * Created by Brian on 12/8/2014.
 */
public class ArrayListRemovePs {
    public static void removePlurals(ArrayList<String> a)
    {
        for (int i = a.size() - 1; i >= 0; i--)
        {
            if (a.get(i).endsWith("s"))
            {
                a.remove(i);
            }
        }
    }
}
