package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);
    }
}
