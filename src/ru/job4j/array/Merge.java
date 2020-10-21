package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];

        int first = 0;
        int second = 0;

        for (int cur = 0; cur < sortedArray.length; cur++) {
            if (first >= left.length) {
                sortedArray[cur] = right[second];
                second++;
            } else if (second >= right.length) {
                sortedArray[cur] = left[first];
                first++;
            } else {
                if (left[first] <= right[second]) {
                    sortedArray[cur] = left[first];
                    first++;
                } else {
                    sortedArray[cur] = right[second];
                    second++;
                }
            }
        }

        return sortedArray;
    }
}
