package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void sumExpected55() {
        int rsl = Counter.sum(1, 10);
        assertThat(rsl, is(55));
    }

    @Test
    public void sumByEvenExpected30() {
        int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(30));
    }

    @Test
    public void sumByEvenExpected0() {
        int rsl = Counter.sumByEven(0, 1);
        assertThat(rsl, is(0));
    }
}
