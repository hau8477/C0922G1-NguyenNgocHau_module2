package ss11_stack_and_queue.exercise.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int decimal = Integer.parseInt(scanner.nextLine());

        Stack<Integer> binary = new Stack<>();

        while (decimal > 0) {
            binary.push(decimal % 2);
            decimal /= 2;
        }

        System.out.print("Binary is: ");
        int size = binary.size();

        for (int i = 0; i < size; i++) {
            System.out.print(binary.pop() + "");
        }
    }
}
