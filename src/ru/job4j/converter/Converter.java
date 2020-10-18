package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int value = 420;
        int euro = Converter.rubleToEuro(value);
        int dollar = Converter.rubleToDollar(value);
        System.out.printf("%d rubles are %d euros.\n", value, euro);
        System.out.printf("%d rubles are %d dollars.\n", value, dollar);
    }
}
