package Chapter6Exercises;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of car parked yesterday: ");
        double numberOfCars = input.nextDouble();

        double hoursParked = 0;
        double currentCost = 0;
        double totalCost = 0;

        for (int count = 1; count <= numberOfCars; count++){
            System.out.println("enter hours parked for car " + count + ": ");
            hoursParked = input.nextDouble();
            currentCost = calculateCharges(hoursParked);
            totalCost += currentCost;
        }
        System.out.println("Most recent customer paid: " + currentCost);
        System.out.println("Running total of receipts: " + totalCost);
    }
    public static double calculateCharges(double numHours){
        double garageCost = 0;
        if (numHours <= 3)
            garageCost = 2;
        else if (numHours > 3 && numHours <= 19)
            garageCost = 2.0 + 0.5 * (numHours - 3);
        else if (numHours > 19)
            garageCost = 10;
        return garageCost;
    }
}
