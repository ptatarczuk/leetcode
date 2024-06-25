package com.example.leetcode.Array;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0) return 0;
        if (haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leetc";

        System.out.println(strStr(haystack, needle));
    }
}
