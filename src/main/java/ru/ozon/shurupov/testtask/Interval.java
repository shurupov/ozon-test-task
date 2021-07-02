package ru.ozon.shurupov.testtask;

import java.util.Arrays;

public class Interval {
    public static void main(String[] args) {
        int[] source = new int[]{10, -3, -12, 8, 42, 1, -7, 0, 3};
        int[] result = findSubarrayWithMaxSum2(source);
        System.out.println("findSubarrayWithMaxSum(" + Arrays.toString(source) + ")=" + Arrays.toString(result));
    }

    public static int[] findSubarrayWithMaxSum1(int[] source) {
        int last = 0;
        int first = 0;
        int maxSum = 0;
        for (int i = 0; i < source.length; i++) {
            int sum = 0;
            for (int j = i; j < source.length; j++) {
                sum += source[j];
                if (sum > maxSum) {
                    first = i;
                    last = j;
                    maxSum = sum;
                }
            }
        }
        return new int[] {first, last};
    }

    public static int[] findSubarrayWithMaxSum2(int[] source) {
        int last = 0;
        int first = 0;
        int maxSum = 0;
        int minLeftSubtrahend = 0;
        int minLeftSubtrahendEnd = -1;
        int sum = 0;
        int leftSubtrahend = 0;
        for (int i = 0; i < source.length; i++) {
            leftSubtrahend += source[i];
            sum += source[i];
            if (leftSubtrahend < minLeftSubtrahend) {
                minLeftSubtrahend = leftSubtrahend;
                minLeftSubtrahendEnd = i;
            }
            if (sum - minLeftSubtrahend > maxSum) {
                maxSum = sum - minLeftSubtrahend;
                first = minLeftSubtrahendEnd + 1;
                last = i;
            }
        }
        return new int[] {first, last};
    }
}