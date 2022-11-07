package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
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
        System.out.print("Enter element to delete: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(deleteElementInArray(array,number)));
    }

    public static int[] deleteElementInArray(int[] array,int number) {
        int size = array.length - 1;
        for (int i = 0; i <= size; i++) {
            if (number == array[i]) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j+1];
                }
                array[size] = 0;
            }
        }

        return array;
    }
}
