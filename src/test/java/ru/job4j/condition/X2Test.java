package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void calc1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calc2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calc3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calc4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int result = X2.calc(a, b, c, x);
        assertThat(result).isEqualTo(expected);
    }
}