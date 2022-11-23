package ss14_sort_algorithm.exercise.insert_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
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
        insertSort(arrayInteger);
    }

    public static void insertSort(int[] array) {
        int x, pos;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }

        System.out.println("Array after sorted: " + Arrays.toString(array));
    }
}
