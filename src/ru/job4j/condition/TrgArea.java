package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double P = (a + b + c) / 2;
        double x = P * (P - a) * (P - b) * (P - c);
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
