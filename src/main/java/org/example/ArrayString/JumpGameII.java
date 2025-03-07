package org.example.ArrayString;

/* https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150 */

public class JumpGameII {

    public static int jumpPractice(int[] nums) {

        return -1;










    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4};

        //System.out.println(jump(nums));
        System.out.println(jumpPractice(nums));
    }
    public static int jump(int[] nums) {
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastJumpIdx = 0;

        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIdx) {
                lastJumpIdx = coverage;
                totalJumps++;

                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }


}