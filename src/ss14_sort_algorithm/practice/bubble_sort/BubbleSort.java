package ss14_sort_algorithm.practice.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayInteger = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        bubbleSort(arrayInteger);
        System.out.println(Arrays.toString(arrayInteger));
    }

    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        int lengthArray = array.length;

        for (int i = 1; i < lengthArray && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < lengthArray - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
