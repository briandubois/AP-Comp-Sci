package me.briandubois.Tickets;

/**
 * @author Brian DuBois
 */
public class WalkupTicket extends Ticket {
    public WalkupTicket(int number) {
        super(number);
    }

    @Override
    public int getPrice() {
        return 50;
    }
}