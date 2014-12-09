package me.briandubois.Tickets;

/**
 * @author Brian DuBois
 */
public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int days) {
        super(number, days);
    }

    public int getPrice() {
        return super.getPrice() / 2;
    }
}