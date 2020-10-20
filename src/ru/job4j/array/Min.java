package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                int temp = min;
                min = array[index];
                array[index] = temp;
            }
        }

        return min;
    }
}