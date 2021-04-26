package Chapter6Exercises;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer number to determine whether a number is odd or even number: ");
         int num = input.nextInt();
            if (num % 2 == 0){
                System.out.println( num + " is even number");
            }else{
                System.out.println( num + " is odd number");
            }

        }
    }
