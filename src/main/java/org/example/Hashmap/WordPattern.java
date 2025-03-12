package org.example.Hashmap;
import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150 */

public class WordPattern {
    public static boolean wordPatternPractice(String pattern, String s) {
        return false;











    }



    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPatternPractice(pattern, s));
        //System.out.println(wordPattern(pattern, s));
        //System.out.println(wordPatternII(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if (pattern.length() != split.length) return false;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (!map.containsKey(c)) {
                if (!map.containsValue(split[i])) {
                    map.put(c, split[i]);
                } else {
                    return false;
                }
            } else if (!map.get(c).equals(split[i])) {
                return false;
            }
        }
        return true;
    }



    public static boolean wordPatternII(String pattern, String s) {
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