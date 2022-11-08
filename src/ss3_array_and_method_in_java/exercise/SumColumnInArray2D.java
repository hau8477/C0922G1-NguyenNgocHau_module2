package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumnInArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the column: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the row: ");
        int column = Integer.parseInt(scanner.nextLine());

        double[][] array2D = new double[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter elements column " + (i + 1) + " row " + (j + 1) + ": ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));

        System.out.println("What column do you want to sum?");
        int columnX = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 0; i < row; i++) {
            sum += array2D[columnX-1][i];
        }

        System.out.println("Sum in column " + columnX + ": " + sum);
    }
}
