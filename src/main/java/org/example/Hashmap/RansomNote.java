package org.example.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150 */

public class RansomNote {
    public static boolean canConstructPractice(String ransomNote, String magazine) {
        if (magazine.length() == 0) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;






    }

    public static void main(String[] args) {
        String ransomNote = "aaa";
        String magazine = "aab";

        //System.out.println(canConstruct(ransomNote, magazine));
        System.out.println(canConstructPractice(ransomNote, magazine));
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

    public boolean canConstructStream(String ransomNote, String magazine) {
        Map<Character, Long> letterCount = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return ransomNote.chars()
                .mapToObj(c -> (char) c)
                .allMatch(c -> letterCount.containsKey(c) && letterCount.put(c, letterCount.get(c) - 1) > 0);

    }

    public boolean canConstructArray(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}
