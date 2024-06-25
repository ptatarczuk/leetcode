package com.example.leetcode.TwoPointers;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;

                if (sPointer == s.length()) return true;
            }
            tPointer++;
        }
        return false;
    }

    public static boolean isSubsequence2(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }


    public static void main(String[] args) {
        String s = "axc";
        String t = "axchbgdc";

        System.out.println(isSubsequence2(s, t));
    }
}
