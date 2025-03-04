package org.example.ArrayString;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    // bruteforce solution with 0(n*n) time complexity, needs to be refactored
    public static int[] productExceptSelfBruteforce(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) temp *= nums[j];
            }
            result[i] = temp;
        }
        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        suffix[n -1] = 1;

        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------");

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
            System.out.println(Arrays.toString(prefix));
        }
        System.out.println("-------------------");
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
            System.out.println(Arrays.toString(suffix));
        }
        System.out.println("-------------------");

        for (int i = 0; i < n; i++) {
            result[i]=prefix[i]*suffix[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(productExceptSelfBruteforce(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
}



/*
        int[] result = new int[nums.length];


        int total = 1;

        int zeroCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounter++;
            } else {
                total *= nums[i];
            }
            if (zeroCounter > 1) return new int[n];
        }


        for (int i = 0; i <nums.length; i++) {
            if (zeroCounter > 0) {
                if (nums[i] == 0) {
                    result[i] = total;
                } else {
                    result[i] = 0;
                }
            } else {
                if (nums[i] != 0) {
                    result[i] = total / nums[i];
                }
            }

        }
        return result;

 */