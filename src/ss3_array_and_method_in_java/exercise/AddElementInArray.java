package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
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

        System.out.print("Enter the number to insert: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the index to insert: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index > size - 1) {
            System.out.println("Unable to insert element into array");
        } else {
            array[index] = number;
            for (int i = index; i < size; i++) {
                array[i + 1] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
