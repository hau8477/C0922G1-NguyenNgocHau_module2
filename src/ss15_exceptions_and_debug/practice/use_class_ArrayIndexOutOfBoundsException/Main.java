package ss15_exceptions_and_debug.practice.use_class_ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element: ");
        int index = Integer.parseInt(scanner.nextLine());

        try {
            System.out.println("Value element index " + index  + " is : " + array[index]);
        } catch (IndexOutOfBoundsException e ) {
            System.err.println("Index exceeds the limit of the array");
        }
    }
}
