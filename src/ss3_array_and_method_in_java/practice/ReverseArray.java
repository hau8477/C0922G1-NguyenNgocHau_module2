package ss3_array_and_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size/2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
