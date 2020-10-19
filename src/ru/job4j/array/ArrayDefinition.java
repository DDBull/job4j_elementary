package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        String[] names = new String[4];
        names[0] = "Dauren";
        names[1] = "Zhansaya";
        names[2] = "Aruel";
        names[3] = "Tamerlan";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
