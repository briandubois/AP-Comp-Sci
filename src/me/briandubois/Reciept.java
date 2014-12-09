package me.briandubois;

public class Reciept {
    public static void main(String[] args) {
        //Calculate total owed, assuming 8%tax / 15% tip
        int Subtotal;
        Subtotal = 108;
        System.out.println("Subtotal:");
        System.out.println(Subtotal);
        System.out.println("Tax:");
        System.out.println(Subtotal * .08);
        System.out.println("Tip:");
        System.out.println(Subtotal * .15);
        System.out.println("Total:");
        System.out.println(Subtotal +
                Subtotal * .08 +
                Subtotal * .15);
        System.out.println("Thank you for your service. Have a nice day.");
    }
}
    