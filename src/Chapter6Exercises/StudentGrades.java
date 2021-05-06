package Chapter6Exercises;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Please Enter your Grade: ");
        int studentScore = score.nextInt();

        if (studentScore > 100){
            System.out.println("Please Enter Valid Score From 0 to 100");
        }

        qualityPoint(studentScore);
    }
    public static int qualityPoint(int grade){
        int grades = 0;
        if (grade >= 90 && grade <=100){
            System.out.println("Your Grade is: " + 4);
        }else
            if (grade >= 80 && grade <= 89){
                System.out.println("Your Grade is: " + 3);
            }else
                if (grade >= 70 && grade <= 79){
                    System.out.println("Your Grade is: " + 2);
                }
                else
                    if (grade >= 60 && grade <= 69){
                        System.out.println("Your Grade is: " + 1);
                    }else
                        if (grade < 60){
                            System.out.println("Your Grade is: " + 0);
                        }
                        return grades;
    }

}