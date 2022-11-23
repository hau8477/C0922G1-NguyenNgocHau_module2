package ss14_sort_algorithm.exercise.insert_sort_by_step;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
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
        insertionSort(arrayInteger);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                System.out.println("Steps to change: " + Arrays.toString(array));
                pos--;
            }
            array[pos] = x;
            if (i != pos) {
                System.out.println("Array after inserting array[" + pos + "] = array[" + i + "] is: "
                        + Arrays.toString(array));
            }
        }

        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}
