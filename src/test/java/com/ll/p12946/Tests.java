package com.ll.p12946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("n=2 -> [ [1,2], [1,3], [2,3] ]")
    void t01() {
        assertThat(
                new Solution().solution(2)
        ).isEqualTo(
                new int[][]{{1, 2}, {1, 3}, {2, 3}}
        );
    }

    @Test
    @DisplayName("from=1, to=2, n=2 => [[1,3], [1,2], [3,2]]")
    void t02() {
        assertThat(
                new Hanoi(1, 2, 2).toArray()
        ).isEqualTo(
                new int[][]{{1, 3}, {1, 2}, {3, 2}}
        );
    }
}
