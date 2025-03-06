package org.example.ArrayString;
import java.util.Arrays;

/* https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150 */
public class MajorityElement {

    public static int majorityElementPractice(int[] nums) {
        return -1;








    }
    public static void main(String[] args) {
        int[] nums = {3,3,2,2,3};

        //System.out.println(majorityElement(nums));
        System.out.println(majorityElementPractice(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }


}
