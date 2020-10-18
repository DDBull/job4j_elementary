package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return 1.15 * (height - 100);
    }

    public static double womanWeight(short height) {
        return 1.15 * (height - 110);
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
