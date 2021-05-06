package Chapter6Exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int low = 1;
        int high = 10000;
        int result = random.nextInt(high - low) + low;

        int numOfTries = 0;

        System.out.println("Hello let's play a guess game! ");
        System.out.println("Guess a number from 1 to 1000! ");
        System.out.println("");
        System.out.println("What is your guess: ");
        System.out.println("");

        Scanner checkingInput = new Scanner(System.in);

        for (numOfTries = 1; numOfTries < 6; numOfTries++) {
            int numberOfChecking = checkingInput.nextInt();
            if (numberOfChecking == result) {
                System.out.println("Correct! it too you " + numOfTries + "to guess the right number!");
                System.out.println("Game Over, You Won");
                break;

            } else if (numberOfChecking < low || numberOfChecking > high) {
                System.out.println("Remember that the guessing range is between " + low + " though " + high);
                System.out.println("Guess again...");
            } else if (numberOfChecking < result && numOfTries < 5) {
                System.out.println("Your guess is too small. Guess again.");
            } else if (numberOfChecking > result && numOfTries < 5) {
                System.out.println("Your guess is too Big guess again. ");
            } else if (numberOfChecking > result && numOfTries == 5) {
                System.out.println("Your guess is too big. Game over, Loser! ");
                System.out.println("You were not able to guess the right number in 5 tries.");
                System.out.println("The correct number was" + result);
            } else if (numberOfChecking < result && numOfTries == 5) {
                System.out.println("Your guess is too small. Game over, Loser! ");
                System.out.println("You were not able to guess the right number in 5 tries.");
                System.out.println("The correct number was: "  + result);

            }

        }

    }
}