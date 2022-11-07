package ss2_loop_in_java.practice;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number a : ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number b : ");
        int b = Integer.parseInt(scanner.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("There is no greatest common divisor");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("The greatest common divisor is: " + a);
        }
    }
}
