package org.example.ArrayString;
import java.util.Arrays;

/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesPractice(int[] nums) {
        return -1;









    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(nums));
        //removeDuplicates(nums);
        removeDuplicatesPractice(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int p = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[p++] = nums[i];
            }
        }
        return p;
    }


}
