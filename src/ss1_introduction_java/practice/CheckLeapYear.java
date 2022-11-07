package ss1_introduction_java.practice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter 1 year");
        int year = Integer.parseInt(scanner.nextLine());

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Year " + year + " is a leap year");
        } else if (year % 400 == 0) {
            System.out.println("Year " + year + " is a leap year");
        } else System.out.println("Year " + year + " is not a leap year");
    }
}
