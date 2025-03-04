package org.example.ArrayString;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(productExceptSelf(nums)));


    }
}
