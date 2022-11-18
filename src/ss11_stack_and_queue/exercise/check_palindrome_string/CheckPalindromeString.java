package ss11_stack_and_queue.exercise.check_palindrome_string;

import java.util.*;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        String[] arrayString = string.toLowerCase().split("");

        Stack<String> stringStack = new Stack<>();

        for (String s : arrayString) {
            if (!Objects.equals(s, " ")) {
                stringStack.push(s);
            }
        }

        Queue<String> stringQueue = new ArrayDeque<>();

        for (String s : arrayString) {
            if (!Objects.equals(s, " ")) {
                stringQueue.add(s);
            }
        }

        boolean checkPalindrome = true;
        int sizeString = stringQueue.size();

        for (int i = 0; i < sizeString; i++) {
            if (!Objects.equals(stringStack.pop(), stringQueue.poll())) {
                checkPalindrome = false;
                break;
            }
        }

        if (checkPalindrome) {
            System.out.println(" \"" + string + "\" is string Palindrome");
        } else {
            System.out.println(" \"" + string + "\" is not string Palindrome");
        }
    }
}
