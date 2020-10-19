package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 1);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 1);
    }

    @Test
    public void whenWoman170Then70() {
        short in = 170;
        double expected = 70;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 1);
    }
}
