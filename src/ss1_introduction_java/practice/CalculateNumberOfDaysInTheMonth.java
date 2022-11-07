package ss1_introduction_java.practice;

import java.util.Scanner;

public class CalculateNumberOfDaysInTheMonth {
    public static void main(String[] args) {
        System.out.println("Calculate the number of days in the month");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the month: ");
        int month = Integer.parseInt(scanner.nextLine());

        switch (month) {
            case 2:
                System.out.println("Month " + month + " have 28 or 29 days (if it's a leap year)");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month " + month + " have 30 days");
                break;
            default:
                System.out.println("You entered invalid");
        }
    }
}
