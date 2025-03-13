package org.example.Hashmap;
import java.util.Arrays;

/* https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150 */

public class ValidAnagram {
    public static boolean isAnagramPractice(String s, String t) {
        return false;









    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        //System.out.println(isAnagram(s, t));
        System.out.println(isAnagramPractice(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
