package Chapter6Examples;


import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int frequency = 0;
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;


        for (int roll = 1; roll <= 6000000; roll++){
            int face = 1 + randomNumbers.nextInt(6);

            switch (face) {
                case 1 -> ++frequency;
                case 2 -> ++frequency1;
                case 3 -> ++frequency2;
                case 4 -> ++frequency3;
                case 5 -> ++frequency4;
                case 6 -> ++frequency5;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency, frequency1, frequency2, frequency3,
                frequency4, frequency5);
    }
}
