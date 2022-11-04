package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CalculateNumberOfDaysInTheMonth {
    public static void main(String[] args) {
        System.out.println("Tính số ngày trong tháng");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn hãy nhập tháng hiện tại: ");
        int month = Integer.parseInt(scanner.nextLine());

        switch (month) {
            case 2:
                System.out.println("Tháng " + month + " có 28 hoặc 29 ngày(nếu là năm nhuận)");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có: 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có: 30 ngày");
                break;
            default:
                System.out.println("Bạn nhập không hợp lệ");
        }
    }
}
