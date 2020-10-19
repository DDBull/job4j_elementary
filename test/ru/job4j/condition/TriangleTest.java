package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void existTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void existFalse() {
        boolean result = Triangle.exist(6.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}