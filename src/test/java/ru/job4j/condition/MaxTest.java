package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void when12Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when123Then3() {
        int result = Max.max(1, 2, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when1234Then4() {
        int result = Max.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}