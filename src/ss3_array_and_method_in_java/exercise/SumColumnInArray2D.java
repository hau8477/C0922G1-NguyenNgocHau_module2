package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumnInArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the row: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the column: ");
        int column = Integer.parseInt(scanner.nextLine());

        double[][] array2D = new double[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter elements row " + (i + 1) + " column " + (j + 1) + ": ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));

        System.out.println("What column do you want to sum?");
        int columnX = Integer.parseInt(scanner.nextLine());


        do {
            if (columnX <= 0 || columnX > row - 1) {
                System.out.println("Please enter column 1->" + (row - 1));
                columnX = Integer.parseInt(scanner.nextLine());
            }
        } while (columnX <= 0 || columnX > row - 1);

        double sum = 0;

        for (int i = 0; i < row; i++) {
            sum += array2D[i][columnX - 1];
        }

        System.out.println("Sum in column " + columnX + ": " + sum);
    }
}