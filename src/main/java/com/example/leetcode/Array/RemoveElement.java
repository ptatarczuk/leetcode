package com.example.leetcode.Array;

import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int size = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[size++] = nums[i];
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}
