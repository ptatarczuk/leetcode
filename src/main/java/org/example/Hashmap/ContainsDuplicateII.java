package org.example.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150 */

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicatePractice(int[] nums, int k) {









        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicatePractice(nums, k));
        System.out.println(containsNearbyDuplicateSlidingWindow(nums, k));
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicateSlidingWindow(int[] nums, int k) {
        if (k == 0) return false;

        Set<Integer> slidingWindow = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (slidingWindow.contains(nums[i]))
                return true;
            if (i >= k)
                slidingWindow.remove(nums[i - k]);
            slidingWindow.add(nums[i]);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                int diff = Math.abs(i - map.get(nums[i])); // abs not required, next index is always bigger
                if (diff <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
