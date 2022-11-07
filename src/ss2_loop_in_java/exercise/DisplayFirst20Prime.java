package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFirst20Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number to be display: ");

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean check = true;

        for (int i = 2; i < 100; i++) {
            if (count <= n) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(i);
                    count++;
                }
                check = true;
            } else break;
        }
    }
}
