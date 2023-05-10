package com.ll.p42862;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("n = 5, lost = [2, 4], reserve = [1, 3, 5] -> 5")
    void test01() {
        assertThat(
                new Solution().solution(5, new int[]{2, 4}, new int[]{1, 3, 5})
        ).isEqualTo(
                5
        );
    }

    @Test
    @DisplayName("n = 5, lost = [2, 4], reserve = [3] -> 4")
    void test02() {
        assertThat(
                new Solution().solution(5, new int[]{2, 4}, new int[]{3})
        ).isEqualTo(
                4
        );
    }

    @Test
    @DisplayName("n = 3, lost = [3], reserve = [1] -> 2")
    void test03() {
        assertThat(
                new Solution().solution(3, new int[]{3}, new int[]{1})
        ).isEqualTo(
                2
        );
    }
}
