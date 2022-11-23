package ss14_sort_algorithm.practice.illustration_bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a length array: ");
        int lengthArrayInteger = Integer.parseInt(scanner.nextLine());
        int[] arrayInteger = new int[lengthArrayInteger];

        for (int i = 0; i < lengthArrayInteger; i++) {
            System.out.print("Enter values element " + (i + 1) + ": ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Your array input: " + Arrays.toString(arrayInteger));
        System.out.println("Begin sort processing...");
        bubbleSortByStep(arrayInteger);
    }

    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        int lengthArray = array.length;

        for (int i = 1; i < lengthArray && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < lengthArray - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }

        if (!needNextPass) {
            System.out.println("Array may be sorted and next pass not needed!");
        }

        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}
