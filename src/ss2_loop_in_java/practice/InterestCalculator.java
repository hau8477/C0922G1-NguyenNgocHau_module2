package ss2_loop_in_java.practice;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 month interest rate: ");
        double interestRate = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter deposit amount: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the number of sending months: ");
        byte month = Byte.parseByte(scanner.nextLine());
        double totalInterest = 0;

        for (int i = 1; i <month ; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("The total interest is: " + totalInterest);

    }
}
