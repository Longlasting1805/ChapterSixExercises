package Chapter6Exercises;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Greatest Common Divisor");
        int greatestNumber1 = input.nextInt();
        System.out.println("Enter Second Greatest Common Divisor: ");
        int greatestNumber2 = input.nextInt();

        gcd(greatestNumber1,greatestNumber2);
        System.out.printf("Greatest Common Divisor is: %d ", gcd(greatestNumber1,greatestNumber2));
    }
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
     return gcd(b,a%b);
    }
}
