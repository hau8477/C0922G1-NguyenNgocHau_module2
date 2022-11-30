package ss19_string_and_regex.exercise.validate_name_class;

import java.util.Scanner;

public class NameClassTest {
    public static void main(String[] args) {
        NameClasses classes = new NameClasses();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name class: ");
        String nameClasses = scanner.nextLine();

        if (classes.validateNameClasses(nameClasses)) {
            System.out.println("Name class valid.");
        } else {
            System.out.println("Name class not valid.");
        }
    }
}
