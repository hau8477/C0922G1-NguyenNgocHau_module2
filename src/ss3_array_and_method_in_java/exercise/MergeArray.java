package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1, size2, size3;
        int[] array3, array1, array2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size array 1: ");
        size1 = Integer.parseInt(scanner.nextLine());
        array1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 1 : ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Enter a size array 2: ");
        size2 = Integer.parseInt(scanner.nextLine());
        array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 2 : ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        size3 = size1 + size2;

        array3 = new int[size3];

        System.arraycopy(array1, 0, array3, 0, size1);
        System.arraycopy(array2, 0, array3, size1, size3 - size1);
        System.out.println("Array 3: \n" + Arrays.toString(array3));
    }
}
