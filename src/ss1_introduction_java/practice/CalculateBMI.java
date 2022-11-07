package ss1_introduction_java.practice;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (kg): ");
        double weight = Float.parseFloat(scanner.nextLine());

        System.out.print("Height(m): ");
        double height = Float.parseFloat(scanner.nextLine());

        double bmi = (weight / Math.pow(height, 2));
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else System.out.println("Fat");
    }
}
