package ru.job4j.array;

public class ReverseLoopForArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers.length - 1 - i;
            if (cur % 2 == 0) {
                System.out.println(
                        "Текущий элемент массива начиная с последнего: "
                                + numbers[cur]
                );
            }
        }
    }
}
