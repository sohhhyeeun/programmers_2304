package com.ll.p42586;

import com.ll.p42586.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Tests {
    @Test
    @DisplayName("[93, 30, 55], [1, 30, 5] → [2, 1]")
    void t01() {
        assertThat(
                new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})
        ).isEqualTo(
                new int[]{2, 1}
        );
    }
}
