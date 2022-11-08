package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class AppToCountStudentPassExam {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];
        for (int j = 0; j < size; j++) {
            System.out.print("Enter a mark for student " + (j + 1) + ": ");
            array[j] = scanner.nextInt();
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int i : array) {
            System.out.print(i + " ");
            if (i >= 5 && i <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
