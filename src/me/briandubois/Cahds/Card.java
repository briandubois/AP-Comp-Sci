package me.briandubois.Cahds;

/**
 * Created by Brian DuBois on 2/13/2015.
 */
public class Card {
    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit)
    {
        face = cardFace;
        suit = cardSuit;
    }

    //returns format is, for example, "King of Hearts".
    @Override
    public String toString()
    {
        return face + " of " + suit;
    }
}
