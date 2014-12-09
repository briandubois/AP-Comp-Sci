package me.briandubois;

public class Copy {
    public static String copyString(String a, int b) {
        String word = a;
        for (int j = 1; j < b; j++) {
            word = a + word;
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.print(copyString("Woof ", 5));
    }
}
  
  