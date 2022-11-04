package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cân nặng(kg): ");
        double weight = Float.parseFloat(scanner.nextLine());

        System.out.print("Chiều cao(m): ");
        double height = Float.parseFloat(scanner.nextLine());

        double bmi = (weight / Math.pow(height, 2));
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else System.out.println("Béo phì");
    }
}
