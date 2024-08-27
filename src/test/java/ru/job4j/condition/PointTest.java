package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3525to3530then5() {
        Point a = new Point(35, 25);
        Point b = new Point(35, 30);
        double expected = 5;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus56to2Minus59then3() {
        Point a = new Point(-5, 6);
        Point b = new Point(-5, 9);
        double expected = 3;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when619to719then1() {
        Point a = new Point(6, 19);
        Point b = new Point(7, 19);
        double expected = 1;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}