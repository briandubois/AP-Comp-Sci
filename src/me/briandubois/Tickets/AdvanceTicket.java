package me.briandubois.Tickets;

/**
 * @author Brian DuBois
 */
public class AdvanceTicket extends Ticket {
    private int days;

    public AdvanceTicket(int number, int days) {
        super(number);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        if (days >= 10)
            return 30;
        else
            return 40;
    }
}