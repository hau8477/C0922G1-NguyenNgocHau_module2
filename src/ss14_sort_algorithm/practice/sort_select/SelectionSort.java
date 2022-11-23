package ss14_sort_algorithm.practice.sort_select;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] arrayDouble = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(arrayDouble);
        System.out.println(Arrays.toString(arrayDouble));
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = (int) array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = (int) array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
