package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDayIsMonday() {
        assertThat(SwitchWeek.nameOfDay(1), is("Monday"));
    }

    @Test
    public void nameOfDayIsTuesday() {
        assertThat(SwitchWeek.nameOfDay(2), is("Tuesday"));
    }

    @Test
    public void nameOfDayIsWednesday() {
        assertThat(SwitchWeek.nameOfDay(3), is("Wednesday"));
    }

    @Test
    public void nameOfDayIsThursday() {
        assertThat(SwitchWeek.nameOfDay(4), is("Thursday"));
    }

    @Test
    public void nameOfDayIsError() {
        assertThat(SwitchWeek.nameOfDay(-1), is("ERROR!"));
    }
}
