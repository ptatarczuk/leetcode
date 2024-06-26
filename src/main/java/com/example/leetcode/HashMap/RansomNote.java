package com.example.leetcode.HashMap;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (char c: ransomNote.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) <= 0) {
                return false;
            }
            counts.put(c, counts.get(c) -1);
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}
