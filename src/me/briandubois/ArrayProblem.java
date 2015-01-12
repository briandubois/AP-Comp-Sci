package me.briandubois;

/**
 * Created by Brian DuBois on 1/12/2015.
 */
public class ArrayProblem {
    public static void main(String[] args) {
        int[][] b = new int[4][5];


        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sum += b[i][j];
            }
        }
        System.out.print(max(b));
        rowSum(b, 2);
        System.out.print(columnSum(b, 3));
        int[] z = allRowSums(b);


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

    }

    //checks if the array is row-magic (this means that every row has the same row sum).
    public static boolean isRowMagic(int[][] a) {

    }


    //checks if the array is col-magic (this means that every col has the same col sum).
    public static boolean isColMagic(int[][] a) {

    }

    /**
     * Javadoc(Java Documentation) (tags)
     *
     * @param a is a square 2 dimensional array of integers, b is an integer=salary
     * @return true if a is both row and column magic and false otherwise.
     */
    public static boolean isMagic(int[][] a) {

    }


}
