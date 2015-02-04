package me.briandubois;

/**
 * Created by Brian DuBois on 2/4/2015.
 */
public class RecursionTest {

    public static void main(String[] args) {

        RecursionTest rt = new RecursionTest();
        System.out.println(rt.mistier(3));

    }

    public int mistier(int n){

        if(n == 0){

            return 1;

        }else{

            return 4 * mistier(n - 1) + 2;

        }

    }

}
