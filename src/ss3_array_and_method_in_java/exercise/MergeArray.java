package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2, size3;
        int[] array3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size array 1: ");
        size1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter a size array 2: ");
        size2 = Integer.parseInt(scanner.nextLine());
        size3 = size1 + size2;
        array3 = new int[size3];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 1 : ");
            array3[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = size1; i < size3; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 2 : ");
            array3[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array3));

    }
}
