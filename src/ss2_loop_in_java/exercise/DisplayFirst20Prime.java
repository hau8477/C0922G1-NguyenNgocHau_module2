package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFirst20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 20;

        int count = 0;
        boolean check = true;
        int number = 2;

        while (count < n) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.print(number + " ");
            }
            check = true;
            number++;
        }
    }
}
