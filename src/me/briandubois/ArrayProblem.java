package me.briandubois;

import java.util.Arrays;

/**
 * Created by Brian DuBois on 1/12/2015.
 */
public class ArrayProblem {
    public static void main(String[] args) {
        int[][] b = new int[4][5];

        int usethisone = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                b[i][j] = usethisone;
            }
        }

        /*
        b[0][4] = 2;
        b[1][4] = 2;
        b[2][4] = 2;
        b[3][4] = 2;
        */

        b[3][0] = 2;
        b[3][1] = 2;
        b[3][2] = 2;
        b[3][3] = 2;
        b[3][4] = 2;

        System.out.println("Max: " + max(b) + "\n");
        System.out.println("Row sum 1: " + rowSum(b, 0) + "\n");
        System.out.println("Row sum 2: " + rowSum(b, 3) + "\n");
        System.out.println("Column Sum 1: " + columnSum(b, 0) + "\n");
        System.out.println("Column Sum 2: " + columnSum(b, 4) + "\n");
        System.out.print("All Rows Sum: " + Arrays.toString(allRowSums(b)) + "\n" + "\n");
        System.out.println("Row magic? " + isRowMagic(b) + "\n");
        System.out.println("Column Magic? " + isColMagic(b) + "\n");
        System.out.println("Magic Magic? " + isMagic(b) + "\n");

    }

    //returns the maximum value in the 2d parameter array a

    public static int max(int[][] a) {
        int maxnum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > maxnum){
                    maxnum =  a[i][j];
                }

            }
        }
        return maxnum;
    }

    //returns the sum of the elements in Row x of a.
    public static int rowSum(int[][] a, int x) {
        int Rowsum = 0;
        for (int i = 0; i < a[x].length; i++){
            Rowsum += a[x][i];
        }
        return Rowsum;
    }

    /*
       Precondition: x is integer in the range of the number of rows
       Postcondition: returns the sum of the elements in Col x of a.
    */
    public static int columnSum(int[][] a, int x) {
        int Colsum = 0;
        for (int i = 0; i < a.length; i ++){
            Colsum += a[i][x];
        }
        return Colsum;
    }

    /*
     * calculates the row sum for every row
     * and returns each of the values in an array.
     * index i of the return array contains the sum of elements in row i.
    */
    public static int[] allRowSums(int[][] a) {
        int[] RowSums = new int[a.length];
        for (int i = 0; i < a.length; i++){
            RowSums[i] = rowSum(a, i);
        }
        return RowSums;
    }

    //checks if the array is row-magic (this means that every row has the same row sum).
    public static boolean isRowMagic(int[][] a) {
        int[] b = allRowSums(a);
        int last = b[0];
        boolean allgood = true;
            for (int i = 1; i < b.length; i++) {
                if (b[i] != last) {
                    allgood = false;
                    break;
                }
                last = b[i];
            }
        return allgood;
    }


    //checks if the array is col-magic (this means that every col has the same col sum).
    public static boolean isColMagic(int[][] a) {
        int last = columnSum(a, 0);
        boolean allgood = true;
            for (int i = 1; i < a.length; i++) {
                if (columnSum(a,i) != last) {
                    allgood = false;
                    break;
                }
                last = columnSum(a,i);
            }
        return allgood;
    }

    /**
     * Javadoc(Java Documentation) (tags)
     *
     * @param a is a square 2 dimensional array of integers, b is an integer=salary
     * @return true if a is both row and column magic and false otherwise.
     */
    public static boolean isMagic(int[][] a) {
        boolean whydoesthisbooleanhavetoexist = false;
        if (isRowMagic(a) && isColMagic(a))
            return true;
        return whydoesthisbooleanhavetoexist;
        //like seriously I can just return true or false in my if statement... like c'mon i thought the whole point of this was to try to create efficient code!!
    }


}
