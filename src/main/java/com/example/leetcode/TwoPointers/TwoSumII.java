package com.example.leetcode.TwoPointers;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;

        while (low < high) {
            int complement = numbers[low] + numbers[high];
            if (complement == target) {
                return new int[]{low + 1, high + 1};
            } else if (complement > target) {
                high--;
            } else {
                low++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
