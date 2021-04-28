package Chapter6Exercises;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius number: ");
        double radius = input.nextDouble();

        double circleArea;
        circleArea = radius * radius * Math.PI;
        System.out.printf("The radius of a circle is: " + radius + "\n and the area is: %.2f" , circleArea);


    }


}
