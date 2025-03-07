package org.example.ArrayString;

/* https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150 */

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStrPractice(String haystack, String needle) {
        return -1;









    }

    public static void main(String[] args) {
        String haystack = "asadbutsad";
        String needle = "sad";

        //System.out.println(strStr(haystack, needle));
        System.out.println(strStrPractice(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0) return 0;
        if (haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;
    }


}
