package ss11_stack_and_queue.exercise.count_word_in_string;

import java.util.*;

public class CountWordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String document = scanner.nextLine();

        String[] arrayDocument = document.split(" ");
        Map<String, Integer> numberWord = new HashMap<>();

        for (String item : arrayDocument) {
            String key = "";
            int value = 0;
            for (String s : arrayDocument) {
                if (Objects.equals(item, s)) {
                    key = item;
                    value++;
                }
            }
           if (!Objects.equals(key, "")) {
               numberWord.put(key, value);
           }
        }
        System.out.println(numberWord);
    }
}
