package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {
            int j = len - i - 1;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }
}
