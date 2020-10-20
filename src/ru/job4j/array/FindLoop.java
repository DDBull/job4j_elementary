package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }

        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        if (start < 0 || finish >= data.length) {
            return -1;
        }

        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }

        return -1;
    }
}
