package ss11_stack_and_queue.exercise.reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mWord = scanner.nextLine();
        String[] arrayString = mWord.split(" ");
        int size = arrayString.length;

        for (int i = 0; i < size; i++) {
            wStack.push(arrayString[i]);
        }

        System.out.print("String reverse: ");

        for (int i = 0; i < size; i++) {
            System.out.print(wStack.pop() + " ");
        }
    }
}
