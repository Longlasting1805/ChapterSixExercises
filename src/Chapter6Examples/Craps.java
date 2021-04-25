package Chapter6Examples;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {Continue, Won, Lost};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_ELEVEN -> gameStatus = Status.Won;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.Lost;
            default -> {
                gameStatus = Status.Continue;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        while (gameStatus == Status.Continue){
            sumOfDice = rollDice();

            if (sumOfDice == myPoint)
                gameStatus = Status.Won;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.Lost;

        }
        if (gameStatus == Status.Won)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");

    }
    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

}
