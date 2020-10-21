package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontalTrue() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoHorizontalTrue2() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'X', 'x', 'X', ' '},
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 3);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoHorizontalSingleElementTrue() {
        char[][] input = {
                {'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(true));
    }

    @Test
    public void whenMonoHorizontalSingleElementFalse() {
        char[][] input = {
                {' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(false));
    }

    @Test
    public void whenHasMonoHorizontalFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }
}
