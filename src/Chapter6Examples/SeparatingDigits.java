package Chapter6Examples;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integer");
        int digit = input.nextInt();
        int divider;

        if ((digit > 9999) && (digit <= 99999)){
            divider = 10000;
        }
        else if ((digit > 999) && (digit <= 9999)){
            divider = 1000;
        }
        else if ((digit > 99) && (digit <= 999)){
            divider = 100;
        }
        else if ((digit > 9) && (digit <= 99)){
            divider = 10;
        }
        else
            divider = 1;

        displayDigit(digit, divider);

    }
    public static void displayDigit(int digitValue, int dividerValue){
        for (int count = 1; dividerValue != 0; count++){
            int displayDigit = digitValue / dividerValue;
            digitValue = digitValue % dividerValue;
            System.out.printf("%d ", displayDigit);

            dividerValue /= 10;
        }
    }
}
