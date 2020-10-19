package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent /= 100.0;

        do {
            amount += amount * percent;
            amount -= salary;
            year++;
        } while (amount > 0);

        return year;
    }
}
