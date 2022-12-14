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
            if (size <= 0) {
                System.out.println("Size must be greater than 0.");
            }
        } while (size <= 0);
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
            for (int i = size -1 ; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = number;
        }
        System.out.println(Arrays.toString(array));
    }
}
