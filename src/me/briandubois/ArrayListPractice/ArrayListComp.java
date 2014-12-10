package me.briandubois.ArrayListPractice;
import java.util.*;

/**
 * Created by Brian DuBois on 12/5/2014.
 */
public class ArrayListComp {
    public static ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        //ArrayList<Integer> Values = new ArrayList<Integer>();

        /*for (int i = 0; i < a.size(); i++)
        {
            int value = a.get(i);
            for (int j = 0; j < b.size(); j++)
            {
                if 
            }
        }*/
        a.retainAll(b);
        //b.retainAll(a);
        return a;
    }
    
    public static void main (String[] args)
    {
      ArrayList<Integer> narg = new ArrayList<Integer>();
      narg.add(1);
      narg.add(4);
      narg.add(8);
      narg.add(9);
      narg.add(11);
      narg.add(15);
      narg.add(17);
      narg.add(28);
      narg.add(41);
      narg.add(59);
      ArrayList<Integer> flarg = new ArrayList<Integer>();
      flarg.add(4);
      flarg.add(7);
      flarg.add(11);
      flarg.add(17);
      flarg.add(19);
      flarg.add(20);
      flarg.add(23);
      flarg.add(28);
      flarg.add(37);
      flarg.add(59);
      flarg.add(81);
      System.out.println(intersect(narg, flarg).toString());
    }
}
