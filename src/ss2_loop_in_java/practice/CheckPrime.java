package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 2) {
            System.out.println(number + " is not prime.");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }
}
