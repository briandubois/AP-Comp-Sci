package me.briandubois;
import java.util.*;

/**
 * Created by Brian on 3/15/2015.
 */
public class MatrixTransformation {


    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Vertical Left to Right:");
        mirrorVerticalLeftToRight(matrix);
        printArray(matrix);


        System.out.println("Vertical Right To Left:");
        mirrorVerticalRightToLeft(matrix);
        printArray(matrix);


        System.out.println("Horizontal Top To Bottom:");
        mirrorHorizontalTopToBottom(matrix);
        printArray(matrix);


        System.out.println("Horizontal Bottom To Top");
        mirrorHorizontalBottomToTop(matrix);
        printArray(matrix);

        System.out.println("Diagonal Right To Left");
        mirrorDiagonalRightToLeft(matrix);
        printArray(matrix);
    }


    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void mirrorVerticalLeftToRight(int[][] a) {
	    int height = a.length;
	    int numCols = a[0].length;
	    for (int row = 0; row <height; row++)
		    for (int col = 0; col < numCols/2; col++)
			    a[row][numCols-1-col] = a[row][col];
    }

    public static void mirrorVerticalRightToLeft(int[][] a) {
	    int height = a.length;
	    int numCols = a[0].length;
	    for (int row = 0; row <height; row++)
		    for (int col = 0; col < numCols/2; col++)
			    a[row][numCols-1-col] = a[row][col];
    }

    public static void mirrorHorizontalTopToBottom(int[][] a) {
        int height = a.length;
        int numCols = a[0].length;
        for (int col = 0; col < numCols; col++)
            for (int row = 0; row <height/2; row++)
                a[height-row-1][col] = a[row][col];
    }

    public static void mirrorHorizontalBottomToTop(int[][] a) {
	    int height = a.length;
	    int numCols = a[0].length;
	    for (int col = 0; col < numCols; col++)
		    for (int row = 0; row <height/2; row++)
			    a[row][col] = a[height-row-1][col];
    }

    public static void mirrorDiagonalRightToLeft(int[][] a) {
	    int height = a.length;
	    int numCols = a[0].length;
	    for (int row = 0; row <height; row++)
		    for (int col = row + 1; col < numCols; col++)
			    a[col][row] = a[row][col];
    }
}

