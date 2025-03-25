package org.example.TwoPointers;

/* https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150 */

public class IsSubsequence {
    public static boolean isSubsequencePractice(String s, String t) {

        return false;








    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequencePractice(s, t));
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

        int sp = 0;
        int tp = 0;

        while (tp < t.length() && sp < s.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
                tp++;
            } else {
                tp++;
            }

        }
        return sp == s.length();
    }

}
