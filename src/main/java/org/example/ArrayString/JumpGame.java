package org.example.ArrayString;

/* https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150 */
public class JumpGame {
    public static boolean canJumpPractice(int[] nums) {

        int finalPosition = nums.length -1;

        for (int i = nums.length -2; i >= 0 ; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;











    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4};

        //System.out.println(canJump(nums));
        System.out.println(canJumpPractice(nums));
    }
    public static boolean canJump(int[] nums) {
        int finalPosition = nums.length -1;

        for (int i = nums.length -2; i >= 0; i--) {
            if (i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }


}
