package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class ShowTheGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the isosceles triangle");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        byte choice = Byte.parseByte(scanner.nextLine());

        do {
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <= 8; i++) {
                        for (int j = 8; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i*2 - 1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 15; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Byte.parseByte(scanner.nextLine());
        } while(choice != 0);
    }
}
