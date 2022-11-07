package ss1_introduction_java.exercise;

import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter USD amount: ");
        float usd = Float.parseFloat(scanner.nextLine());
        float vnd = usd *23000;
        System.out.println(usd + "$ converted to VND is: " + vnd + "VND");
    }
}
