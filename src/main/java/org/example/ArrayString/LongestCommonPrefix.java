package org.example.ArrayString;

import java.util.Arrays;

/* https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150 */

public class LongestCommonPrefix {
    public static String longestCommonPrefixPractice(String[] str) {
        return "";










    }
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        //System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefixPractice(str));
    }
    public static String longestCommonPrefix(String[] str) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        char[] first = str[0].toCharArray();
        char[] last = str[str.length -1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

}
