package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to51then4() {
        double expected = 4;
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenNegative35to7Negative1then11Point66() {
        double expected = 11.66;
        int x1 = -3;
        int y1 = 5;
        int x2 = 7;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to97then7Point81() {
        double expected = 7.81;
        int x1 = 3;
        int y1 = 2;
        int x2 = 9;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}