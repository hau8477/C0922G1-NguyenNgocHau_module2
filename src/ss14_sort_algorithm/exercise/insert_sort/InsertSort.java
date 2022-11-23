package ss14_sort_algorithm.exercise.insert_sort;

public class InsertSort {
    public static void insertSort(int[] array) {
        int x, pos;

        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
