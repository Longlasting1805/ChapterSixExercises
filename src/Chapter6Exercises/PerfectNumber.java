package Chapter6Exercises;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter perfect number: ");
        int number1 = input.nextInt();
        int sum = isPerfect(number1);

        System.out.printf("the number is perfect: %d",isPerfect(sum));
    }
    public static int isPerfect(int num1){
        int perfectNumber = 0;
        for (int count = 1; count < 1000; count++)
            if (num1 % count== 0)
        perfectNumber += count;

       return perfectNumber;

    }

}
