package org.example.ArrayString;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String output = "";

        for (int i = str.length -1;  i >= 0 ; i--) {
            output += str[i] + " ";
        }
        return output.stripTrailing();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";

        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
    }
}
