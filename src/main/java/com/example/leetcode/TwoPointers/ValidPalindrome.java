package com.example.leetcode.TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";

        System.out.println(isPalindrome(s));
    }

}
