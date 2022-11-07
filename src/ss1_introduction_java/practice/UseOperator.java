package ss1_introduction_java.practice;

import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter height: ");
        height = Float.parseFloat(scanner.nextLine());

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
