package ss15_exceptions_and_debug.exercise.use_class_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
     do {
         try {
             System.out.println("Enter side 1: ");
             double side1 = Double.parseDouble(scanner.nextLine());
             System.out.println("Enter side 2: ");
             double side2 = Double.parseDouble(scanner.nextLine());
             System.out.println("Enter side 3: ");
             double side3 = Double.parseDouble(scanner.nextLine());
             checkTriangle(side1,side2,side3);
             break;
         } catch (IllegalTriangleException e) {
             System.err.println(e.getMessage());
         } catch (NumberFormatException e) {
             System.err.println("Triangle edges must be numbers");
         }
     } while (true);
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1+side2) <= side3
                || (side1+side3) <= side2 || (side2+side3) <= side1) {
            throw new IllegalTriangleException();
        }
    }
}
