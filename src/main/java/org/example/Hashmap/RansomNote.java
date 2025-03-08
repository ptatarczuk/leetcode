package org.example.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RansomNote {
    public static boolean canConstructPractice(String ransomNote, String magazine) {
        return false;










    }

    public static void main(String[] args) {
        String ransomNote = "aa";
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
}
