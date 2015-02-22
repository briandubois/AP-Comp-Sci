package me.briandubois.Cahds;

/**
 * Created by Brian DuBois on 2/13/2015.
 */
public class DeckTest {
    public static void main( String[] args )
    {
     /*Create a new deck of cards,
     * shuffle
     * print cards, four per line
     * Hint: use modulo 4 and one for loop
     */
        DeckOfCards casino = new DeckOfCards();
        casino.dealDeck();
        System.out.println();
        System.out.println();
        casino.shuffle();
        casino.dealDeck();
    }
}
