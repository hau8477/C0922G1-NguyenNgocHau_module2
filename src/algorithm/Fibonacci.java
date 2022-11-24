package algorithm;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fibonacci number : ");
        int fibonacci = Integer.parseInt(scanner.nextLine());

        while (fibonacci > 20 || fibonacci < 0) {
            System.out.print("Re-Enter Fibonacci number : ");
            fibonacci = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(findFibonacci(fibonacci));
    }

    public static int findFibonacci(int fibonacci) {
        if (fibonacci == 0 || fibonacci == 1) {
            return 1;
        }
        return findFibonacci(fibonacci - 1) + findFibonacci(fibonacci - 2);
    }
}
