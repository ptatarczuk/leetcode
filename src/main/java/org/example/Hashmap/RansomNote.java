package org.example.Hashmap;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";

        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
            } else {
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (dictionary.containsKey(c) && dictionary.get(c) > 0) {
                dictionary.put(c, dictionary.get(c) -1);
            } else {
                return false;
            }
        }
        return true;
    }
}
