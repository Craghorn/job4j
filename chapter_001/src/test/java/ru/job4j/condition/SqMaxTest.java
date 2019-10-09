package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenp1_4is4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int expected = 4;
        int s = SqMax.max(a, b, c, d);
        assertThat(s, is(expected));
    }

    @Test
    public void whenpminus3to1is1() {
        int a = -3;
        int b = -2;
        int c = -1;
        int d = 1;
        int expected = 1;
        int s = SqMax.max(a, b, c, d);
        assertThat(s, is(expected));
    }
}