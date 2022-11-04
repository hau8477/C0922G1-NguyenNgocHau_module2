package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bạn hãy nhập vào 1 năm");
        int year = Integer.parseInt(scanner.nextLine());

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else if (year % 400 == 0) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else System.out.println("Năm " + year + " không phải là năm nhuận");
    }
}
