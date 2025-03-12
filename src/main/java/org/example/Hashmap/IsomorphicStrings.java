package org.example.Hashmap;
import java.util.HashMap;

/* https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150 */

public class IsomorphicStrings {
    public static boolean isIsomorphicPractice(String s, String t) {
        return true;









    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        //System.out.println(isIsomorphic(s,t));
        System.out.println(isIsomorphicPractice(s,t));

    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {
                if(!map.containsValue(t.charAt(i))) map.put(s.charAt(i), t.charAt(i));
                else return false;
            } else if (map.get(s.charAt(i)) != map.get(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
