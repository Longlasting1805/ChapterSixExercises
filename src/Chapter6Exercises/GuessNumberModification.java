package Chapter6Exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberModification {
    public static void main(String[] args) {
        int random;
        int guess;
        int attempts;

        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        random = generator.nextInt(100);
        attempts = 1;

        System.out.println("I'm thinking a number of 0 to 100, what do you think it is");
        guess = input.nextInt();
        for (attempts = 1; attempts < 10;attempts++) {
            if (guess < 0 || guess > 100){
                System.out.println("Remember random guess numbers is at the range of 0 to 100");
                System.out.println("Guess again");
                guess = input.nextInt();
            }else
                if (guess < random) {
                System.out.println("Lower!");
                    System.out.println("Guess again");
                    guess = input.nextInt();

                } else if (guess > random) {
                    System.out.println("Higher");
                    break;

                }
            }
            System.out.println(random + " is the correct answer and it took you " + attempts + " attempts to guess it!" );
        }

    }
//    }

