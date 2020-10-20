package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int ans = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                ans += anInt;
            }
        }

        return ans;
    }
}
