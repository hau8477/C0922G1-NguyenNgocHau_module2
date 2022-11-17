package ss11_stack_and_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayInteger {
    public static void main(String[] args) {
        int[] arrayInteger = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Before array reverse: ");
        System.out.println(Arrays.toString(arrayInteger));

        Stack<Integer> stackInteger = new Stack<>();
        int size = arrayInteger.length;

        for (int j : arrayInteger) {
            stackInteger.push(j);
        }
        System.out.println("After array reverse: ");
        for (int i = 0; i < size; i++) {
            arrayInteger[i] = stackInteger.pop();
        }
        System.out.println(Arrays.toString(arrayInteger));
    }
}
