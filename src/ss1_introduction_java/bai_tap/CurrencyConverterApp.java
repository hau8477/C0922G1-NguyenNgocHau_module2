package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        float usd = Float.parseFloat(scanner.nextLine());
        float vnd = usd *23000;
        System.out.println(usd + "$ quy ra tiền VNĐ là: " + vnd + "VNĐ");
    }
}
