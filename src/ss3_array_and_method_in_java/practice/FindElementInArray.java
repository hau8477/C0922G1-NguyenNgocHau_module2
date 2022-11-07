package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name’s student: ");
        String name = scanner.nextLine().trim();

        int size = students.length;
        boolean check = false;

        for (int i = 0; i < size; i++) {
            if (name.equals(students[i])) {
                System.out.println("Position of the students" + name + "in the list is: " + (i+1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
