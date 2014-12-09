package me.briandubois;

public class line {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print("");
            }

            System.out.print(line);

            for (int k = 1; k <= (line - 1); k++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
}