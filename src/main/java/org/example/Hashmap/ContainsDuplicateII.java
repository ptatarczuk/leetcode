package org.example.Hashmap;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicatePractice(int[] nums, int k) {





        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearbyDuplicatePractice(nums, k));
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Set<Integer> slidingWindow = new HashSet<>();
        for (int index = 0; index < nums.length; index++) {
            if (slidingWindow.contains(nums[index]))
                return true;
            if (index >= k)
                slidingWindow.remove(nums[index - k]);
            slidingWindow.add(nums[index]);
        }
        return false;
    }
}
