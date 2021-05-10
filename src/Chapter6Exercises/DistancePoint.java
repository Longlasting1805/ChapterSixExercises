package Chapter6Exercises;

import java.util.Scanner;

public class DistancePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates number");
        double coordinate = input.nextDouble();

        double x1 = 1;
        double y1 = 1;
        double x2 = 4;
        double y2 = 4;

        distance(x1,y1, x2, y2);
    }
    public static void distance(double x1, double y1,double x2, double y2){
        double distancing = 0;

        distancing = Math.sqrt(x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        System.out.println("distancing between" +"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+ distancing);

    }
}
