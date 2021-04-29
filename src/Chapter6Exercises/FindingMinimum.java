package Chapter6Exercises;

import java.util.Scanner;

public class FindingMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter three floating-point value: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        minimum(number1, number2, number3);

        System.out.println("minimum is: " + minimum(number1,number2,number3));
    }
    public static double minimum(double a, double b, double c) {
        double smallest = 0;
        smallest = Math.min(a, b);
        smallest = Math.min(smallest, c);
        return smallest;

    }
}
