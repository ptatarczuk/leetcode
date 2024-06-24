package com.example.leetcode.Array;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int size = 0;
        int i = s.length() - 1;

        s = s.stripTrailing();

        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            size++;
        }

        return size;
    }


    public static void main(String[] args) {
        String s = "luffy is still joyboys";

        System.out.println(lengthOfLastWord(s));
    }
}
