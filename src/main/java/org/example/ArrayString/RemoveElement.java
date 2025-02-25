package org.example.ArrayString;

import java.util.Arrays;

/* https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
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
