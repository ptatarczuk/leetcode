package org.example.ArrayString;
import java.util.Arrays;

/* https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150 */

public class MergeSortedArray {
    public static void mergePractice(int[] nums1, int m, int[] nums2, int n) {





    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        System.out.println(Arrays.toString(nums1));
        //merge(nums1, m, nums2, n);
        mergePractice(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            } else {
                nums1[p--] = nums2[p2--];
            }
        }
    }


}
