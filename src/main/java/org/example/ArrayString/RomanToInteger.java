package org.example.ArrayString;

import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150 */
public class RomanToInteger {
    public static int romanToIntPractice(String s) {

        return 0;








    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        //System.out.println(romanToInt(s));
        //System.out.println(romanToIntSwitch(s));
        System.out.println(romanToIntPractice(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() -1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
                } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    /* Switch case solution, slightly better performance  https://www.youtube.com/watch?v=k4KgVd5LQk8 */
    public static int romanToIntSwitch(String s) {
        int sum = 0;
        int current = translator(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = translator(s.charAt(i));

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
            current = next;
        }
        sum += current;
        return sum;
    }

    private static int translator(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
