package ss11_stack_and_queue.exercise.reverse;


import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mWord = scanner.nextLine();
        String[] arrayString = mWord.split(" ");

        for (String s : arrayString) {
            if (!Objects.equals(s, "")) {
                wStack.push(s);
            }
        }

        System.out.print("String reverse: ");

        int sizeWStack = wStack.size();

        for (int i = 0; i < sizeWStack; i++) {
            System.out.print(wStack.pop() + " ");
        }
    }
}
