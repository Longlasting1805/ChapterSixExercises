package Chapter6Exercises;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number: ");
        num1 = input.nextInt();
        System.out.println("enter second number: ");
        num2 = input.nextInt();

        boolean multiple = isMultiple(num1,num2);

        if (multiple == true){
            System.out.printf("%n%d and %d are multiples of each other", num1 , num2);
        }
        else
            System.out.printf("%n%d and %d are not multiples of each other", num1, num2);
    }
    public static boolean isMultiple(int num1, int num2){
        int remainder = num1 % num2;
        boolean multiple;

        if (remainder != 0){
            multiple = false;
        }else{

            multiple = true;
        }
        return multiple;
    }
}
