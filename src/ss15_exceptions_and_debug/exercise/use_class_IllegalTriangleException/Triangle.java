package ss15_exceptions_and_debug.exercise.use_class_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        do {
            try {
                System.out.print("Enter side 1: ");
                side1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter side 2: ");
                side2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter side 3: ");
                side3 = Double.parseDouble(scanner.nextLine());
                checkTriangle(side1, side2, side3);
                break;
            } catch (IllegalTriangleException | NumberFormatException e) {
                System.err.print(e.getMessage());
            }
        } while (true);
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Triangle edges must be positive numbers\n ");
        }

        if ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) <= side1) {
            throw new IllegalTriangleException("Sum of 2 triangle edges must be bigger than the last triangle edge");
        }
        System.out.println("Is a triangle!");
    }
}
