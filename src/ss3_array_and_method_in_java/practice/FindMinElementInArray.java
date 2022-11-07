package ss3_array_and_method_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinElementInArray {
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
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min element in array is: " + minElement(array));
    }

    public static int minElement(int[] array) {
        int min = array[0];
        int size = array.length - 1;
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
