package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        String character = scanner.nextLine();

        int sizeStr = str.length() - 1;
        int count = 0;

        for (int i = 0; i < sizeStr; i++) {
            if (character.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Character " + character + " not appear in string " + str);
        } else System.out.println("Character: " + character.charAt(0) + " appear: " + count);

    }
}
