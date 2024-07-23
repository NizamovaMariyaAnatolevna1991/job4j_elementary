package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3525to3530then5() {
        double expected = 5;
        int x1 = 35;
        int y1 = 25;
        int x2 = 35;
        int y2 = 30;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus56to2Minus59then3() {
        double expected = 3;
        int x1 = -5;
        int y1 = 6;
        int x2 = -5;
        int y2 = 9;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when619to719then1() {
        double expected = 1;
        int x1 = 6;
        int y1 = 19;
        int x2 = 7;
        int y2 = 19;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}