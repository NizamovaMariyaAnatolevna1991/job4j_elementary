package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart5Finish10Then45() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish2Then0() {
        int start = 10;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus1Finish3Then5() {
        int start = -1;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusOneToSevenThenTwelve() {
        int start = -1;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSevenToTwoThenZero() {
        int start = 7;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}