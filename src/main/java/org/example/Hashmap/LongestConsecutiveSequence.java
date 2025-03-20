package org.example.Hashmap;

import java.util.HashMap;

/* https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-interview-150 */

public class LongestConsecutiveSequence {
    public static int longestConsecutivePractice(int[] num) {

        return 0;



    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutivePractice(nums));
    }
    public static int longestConsecutive(int[] num) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : num) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                int sum = left + right + 1;
                map.put(n, sum);

                res = Math.max(res, sum);


                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }
        return res;
    }
}