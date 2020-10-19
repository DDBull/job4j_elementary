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
        int euroExpected = 6;
        int euro = Converter.rubleToEuro(value);
        int dollarExpected = 7;
        int dollar = Converter.rubleToDollar(value);
        boolean test1 = euroExpected == euro;
        boolean test2 = dollarExpected == dollar;

        System.out.printf("%d rubles are %d euros. Test result : %b\n", value, euro, test1);
        System.out.printf("%d rubles are %d dollars. Test result : %b\n", value, dollar, test2);
    }
}
