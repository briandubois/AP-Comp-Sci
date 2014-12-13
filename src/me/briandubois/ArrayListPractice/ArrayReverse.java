package me.briandubois.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Brian on 12/8/2014.
 */
public class ArrayReverse {
    public static List<String> reverse(List<String> a)
    {
        for (int i = 0; i < a.size() / 2; i++) {

            String temp = a.get(i);

            a.set(i, a.get(a.size() - 1 - i));

            a.set((a.size() - 1 - i),temp);
        }
        return a;
    }
}
