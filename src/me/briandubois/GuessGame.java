package me.briandubois;// This program plays a simple guessing game with the user.

import java.util.*;

public class GuessGame {
    public static final int MAX_GUESS = 100000; //user will guess number from 1 to MAX_GUESS=100n


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();
        int numGames = 0;  // total number of games user play
        int totGuesses = 0; // total number of guesses in all games played
        String response = "yes";
        boolean shouldPlay = true;


        System.out.print("Do yout want to play the game?");
        response = console.nextLine();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            shouldPlay = true;
        } else {
            shouldPlay = false;
            System.out.println("Awwww c'mon you gotta try");
        }

        if (!shouldPlay) {
            System.out.print("Do you want to play the game?");
            response = console.nextLine();
            if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                shouldPlay = true;
            } else {
                shouldPlay = false;
                System.out.println("Well ok then, if you REALLY dont want to. Bye...have a beautiful time.");
            }
        }

        while (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            totGuesses += playGame(console);
            numGames++;

            System.out.print("Do yout want to play the game again?");
            response = console.nextLine();
        }

        //once user is done playing, report results.
        if (shouldPlay) {
            reportResults(numGames, totGuesses);
        }
    }


    public static void giveIntro() {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and " + MAX_GUESS);
        System.out.println("and will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess.");
        System.out.println();
    }

    // play one game, return number of guesses user took to get right answer.
    public static int playGame(Scanner console) {
        Random r = new Random();
        int rand = r.nextInt(MAX_GUESS) + 1;
        int numGuesses = 0;
        System.out.println("I'm thinking of a number...");

        int guess = 0;

        while (rand != guess) {
            numGuesses++;
            guess = console.nextInt();
            console.nextLine();
            if (guess < 0)
                guess *= -1;
            if (guess == rand) {
                System.out.println("You got it!!!");
            } else if (guess > rand) {
                System.out.println("Too high. Go lower.");
            } else {
                System.out.println("Too low. Go higher.");
            }
        }
        System.out.println("You got it right in " + numGuesses + " guesses");
        System.out.println();
        return numGuesses;
    }

    // report total games, total guesses and average guess per game.
    public static void reportResults(int numGames, int totGuesses) {
        System.out.println("Overall results:");
        System.out.println();
        if (numGames == 1) {
            System.out.println("You played the game once");
        } else {
            System.out.println("You played the game " + numGames + " times.");
        }
        System.out.println("In total you took " + totGuesses + " guesses.");
        if (totGuesses == 1) {
            System.out.println("On average you took 1 guess per game... Cheater!!!");
        } else {
            System.out.println("On average you took " + totGuesses / numGames + " guesses per game.");
        }
    }
}