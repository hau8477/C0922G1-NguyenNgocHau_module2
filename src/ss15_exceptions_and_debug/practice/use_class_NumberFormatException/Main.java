package ss15_exceptions_and_debug.practice.use_class_NumberFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(a,b);
    }
}
