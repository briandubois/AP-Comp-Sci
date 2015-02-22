package me.briandubois.Cahds;
import java.util.Random;

/**
 * Created by Brian DuBois on 2/13/2015.
 */

public class DeckOfCards
{
    private Card[] deck; //array of Card objects
    private int currentCard;// index of next Card to be dealt(0-51)
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards()
    {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    /*initalize deck and current card */
        deck = new Card[52];
        currentCard = 0;

    /*populate deck with Card objects
      hint: Use modulo and division operations with 13
      and one for loop */
        for (int i = 0; i < NUMBER_OF_CARDS; i++){
            deck[i] = new Card(faces[i%13],suits[i/13]);
        }
    }

    public void shuffle() {
        // after shuffling, dealing should start at deck[ 0 ] again
   /* reinitialize currentCard    */

        // for each Card, pick another random Card (0-51) and swap them
        for ( int first = 0; first < deck.length; first++ )
        {

     /* select a random number between 0 and 51 */
            int second = randomNumbers.nextInt(51);

     /* swap current Card with randomly selected Card */
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
        currentCard = 0;
    }

    public Card dealCard()
    {
  /* if determine whether Cards remain to be dealt
     return current card, else return null */
        if(currentCard<deck.length)
        {
            return deck[currentCard++];

        }
        else
            return null;

    }

    public void dealDeck(){
        for (int i = 0; i < NUMBER_OF_CARDS; i++){
            if (currentCard<deck.length){
                if (i%4 > 0)
                    System.out.print(deck[i] + " ");
                else{
                    System.out.println();
                    System.out.print(deck[i] + " ");
                }
            }
        }

    }

}