package org.example.SlidingWindow;

/* https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150 */

public class MinimumSizeSubarraySum {
    public static int minSubArrayLenPractice(int s, int[] a) {
        return -1;









    }
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int s, int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < a.length) {
            sum += a[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= a[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
