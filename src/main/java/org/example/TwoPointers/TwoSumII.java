package org.example.TwoPointers;

import java.util.Arrays;

/* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150 */

public class TwoSumII {
    public static int[] twoSumPractice(int[] numbers, int target) {
        return new int[]{-1, -1};








    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
        System.out.println(Arrays.toString(twoSumPractice(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;

        while (start < end) {
            int complement = numbers[start] + numbers[end];
            if (complement == target) {
                return new int[] {start + 1, end + 1};
            } else if (complement > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
