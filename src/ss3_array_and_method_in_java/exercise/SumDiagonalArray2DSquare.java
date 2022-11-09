package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalArray2DSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a size: ");
        int size = Integer.parseInt(scanner.nextLine());

        double[][] array2D = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter elements row " + (i + 1) + " column " + (j + 1) + ": ");
                array2D[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array2D));

        double sum = 0;

        for (int i = 0; i < size; i++) {
                sum += array2D[i][i];
        }
        System.out.println("Sum diagonal Array 2D square: " + sum);
    }
}
