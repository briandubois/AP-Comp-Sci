package me.briandubois;

import java.util.Random;

/**
 * Created by Brian on 3/1/2015.
 */
public class GettingMode {

    public static int mode1(int[] a)
    {
        int mode = 0;
        int modeCount = 0;

        for (int i = 1; i <= 100; i++)
        {
            int currentCount = 0;

            for (int j = 0; j < a.length; j++)
            {
                if (a[j] == i)
                    currentCount++;
            }

            if (currentCount > modeCount)
                mode = i;
        }
        return mode;
    }

    public static int mode2(int[] a)
    {
        int[] nums = new int[100];
        int HIndex = -1;
        int HIndexNum = -1;

        for (int i = 0; i < a.length; i++)
        {
            nums[a[i]]++;
            if (nums[a[i]] > HIndexNum)
                HIndex = a[i];
        }
        return HIndex;
    }

    public static void main(String[] args) {
        int[] usedissun = new int[6];
        Random r = new Random();

        for (int i = 0; i < usedissun.length; i++)
        {
            usedissun[i] = i;
        }
        usedissun[5] = 4;

        System.out.println(mode1(usedissun));
        System.out.println(mode2(usedissun));
    }
}
