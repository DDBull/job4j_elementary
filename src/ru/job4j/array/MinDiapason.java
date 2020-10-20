package ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {

        int min = Integer.MAX_VALUE;

        if (start < 0 || finish >= array.length) {
            return min;
        }

        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }
}
