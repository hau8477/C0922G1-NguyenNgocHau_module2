package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;
import java.util.Arrays;


public class FindMaxElementIn2DArray {
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

        double maxInArray2D = array2D[0][0];
        int indexColumn = 0;
        int indexRow = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (maxInArray2D < array2D[i][j]) {
                    maxInArray2D = array2D[i][j];
                    indexColumn = i;
                    indexRow = j;
                }
            }
        }
        System.out.println("Max in array 2d is: " + maxInArray2D + ", position: [" + indexColumn + "][" + indexRow + "]");
    }
}
