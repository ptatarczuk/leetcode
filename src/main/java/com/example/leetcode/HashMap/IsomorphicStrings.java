package com.example.leetcode.HashMap;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char oldChar = s.charAt(i);
            char newChar = t.charAt(i);

            if (!characterMap.containsKey(oldChar)) {
                if (!characterMap.containsValue(newChar)) {
                    characterMap.put(oldChar, newChar);
                } else {
                    return false;
                }
            }
            else if (characterMap.get(oldChar) != newChar) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s,t));

    }
}
