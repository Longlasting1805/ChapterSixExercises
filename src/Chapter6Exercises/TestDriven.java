package Chapter6Exercises;

import Chapter6Exercises.Temperature;

import java.util.Scanner;

public class TestDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Temperature userTemp;
        String userScale;

        System.out.println("Please enter your temp scale (fahrenheit or celsius): ");
        userScale = input.next();
        System.out.println();

        System.out.println("Please enter your temp in "+ userScale + ": ");
        userTemp = new Temperature(input.nextDouble());
        System.out.println();

        System.out.println(userTemp.toString());
        System.out.println();

        System.out.println("Your temp is: " + userTemp.getTemp());
        System.out.println();

        System.out.println("Your scale is: " + userTemp.getScale(userScale));
        System.out.println();

        System.out.println(userTemp.conversion());
        System.out.println();

        double userTemp2 = userTemp.conversion();
        System.out.println(userTemp.aboveBoiling(userTemp2));
    }
}
