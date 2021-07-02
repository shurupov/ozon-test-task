package ru.ozon.shurupov.testtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntervalTest {

    @Test
    void findSubarrayWithMaxSum1() {
        assertArrayEquals(
                new int[] {3,5},
                Interval.findSubarrayWithMaxSum1(new int[]{10, -3, -12, 8, 42, 1, -7, 0, 3})
        );
        assertArrayEquals(
                new int[] {6,8},
                Interval.findSubarrayWithMaxSum1(new int[]{-1, 1, 2, 3, -10, -1, 30, 31, 32, -7, 3})
        );
        assertArrayEquals(
                new int[] {0,4},
                Interval.findSubarrayWithMaxSum1(new int[]{0, 1, 2, 3, 5, -1, -1, -8, -9, -7, 3})
        );
        assertArrayEquals(
                new int[] {7,10},
                Interval.findSubarrayWithMaxSum1(new int[]{-50, 1, 2, 3, 5, -30, -1, 10, 20, 30, 40})
        );
    }

    @Test
    void findSubarrayWithMaxSum2() {
        assertArrayEquals(
                new int[] {3,5},
                Interval.findSubarrayWithMaxSum2(new int[]{10, -3, -12, 8, 42, 1, -7, 0, 3})
        );
        assertArrayEquals(
                new int[] {6,8},
                Interval.findSubarrayWithMaxSum2(new int[]{-1, 1, 2, 3, -10, -1, 30, 31, 32, -7, 3})
        );
        assertArrayEquals(
                new int[] {0,4},
                Interval.findSubarrayWithMaxSum2(new int[]{0, 1, 2, 3, 5, -1, -1, -8, -9, -7, 3})
        );
        assertArrayEquals(
                new int[] {7,10},
                Interval.findSubarrayWithMaxSum2(new int[]{-50, 1, 2, 3, 5, -30, -1, 10, 20, 30, 40})
        );
    }
}