package org.example.Hashmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (pattern.length() != split.length) return false;

        Map<Character, String> words = new HashMap<>();
        Map<String, Character> reverseWords = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = split[i];

            if (words.putIfAbsent(c, word) != null && !words.get(c).equals(word) ||
                    reverseWords.putIfAbsent(word, c) != null && !reverseWords.get(word).equals(c)) return false;

        }
        return true;
    }
}