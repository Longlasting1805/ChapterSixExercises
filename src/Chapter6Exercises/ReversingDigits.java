package Chapter6Exercises;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        System.out.println("enter reverseNumber");
        Scanner input = new Scanner(System.in);
        int reverse = input.nextInt();
       reverseDigit(reverse);
    }
    public static
    void reverseDigit(int reversing){
        int reverse;
        while (reversing > 0){
            reverse = reversing % 10;
            System.out.print(reverse);
            reversing = reversing / 10;
        }
    }
}
