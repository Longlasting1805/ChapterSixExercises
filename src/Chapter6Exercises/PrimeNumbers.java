package Chapter6Exercises;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        if (isPrime(num1)){

            System.out.println(num1 + " Is a primeNumber:");
        }else {
            System.out.println(num1 + " is not a primeNumber:");
        }

    }
    public static boolean isPrime(int a){
        if (a <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0){
                return false;
            }


        }
        return true;

    }
}
