package org.example.ArrayString;

/* https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150 */

public class ReverseWordsInAString {
    public static String reverseWordsPractice(String s) {

    return "";






    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        String s2 = "  hello world  ";

        //System.out.println(reverseWords(s1));
        //System.out.println(reverseWords(s2));
        System.out.println(reverseWordsPractice(s1));
        System.out.println(reverseWordsPractice(s2));

    }
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder output = new StringBuilder();

        for (int i = str.length -1;  i >= 0 ; i--) {
            output.append(str[i]).append(" ");
        }
        return output.toString().stripTrailing();
    }


}
