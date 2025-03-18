package org.example.Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/two-sum/description/?envType=study-plan-v2&envId=top-interview-150 */

public class TwoSum {
    public static int[] twoSumPractice(int[] nums, int target) {








        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumPractice(nums, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }
}
