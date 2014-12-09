package me.briandubois.Tickets;

/**
 * @author Brian DuBois
 */
public class Ticket {
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    public int getPrice() {
        return 50000;
    }

    public String toString() {
        return "Number: " + number + " Price: " + getPrice();
    }
}