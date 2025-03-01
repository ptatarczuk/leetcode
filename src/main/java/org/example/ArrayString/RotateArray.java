package org.example.ArrayString;

import java.util.Arrays;

/* https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150 */

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length -1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 8;

        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}

/*
1,2,3,4,5,6,7
7,6,5,4,3,2,1
7,6,5, 4,3,2,1
5,6,7, 1,2,3,4 <- end result
 */