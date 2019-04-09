package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
            for (int n = array.length; n > 1; n--) {
                for (int index = 0; index + 1 < n; index++) {
                    if (array[index] > array[index + 1]) {
                        int max = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = max;
                    }
                }
            }
        return array;
    }
}
