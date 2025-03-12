package org.example.Hashmap;


/* https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150 */

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
