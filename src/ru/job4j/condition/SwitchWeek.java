package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        String dayOfTheWeek;

        switch (day) {
            case 1:
                dayOfTheWeek = "Monday";
                break;
            case 2:
                dayOfTheWeek = "Tuesday";
                break;
            case 3:
                dayOfTheWeek = "Wednesday";
                break;
            case 4:
                dayOfTheWeek = "Thursday";
                break;
            case 5:
                dayOfTheWeek = "Friday";
                break;
            case 6:
                dayOfTheWeek = "Saturday";
                break;
            case 7:
                dayOfTheWeek = "Sunday";
                break;
            default:
                dayOfTheWeek = "ERROR!";
                break;
        }

        return dayOfTheWeek;
    }
}
