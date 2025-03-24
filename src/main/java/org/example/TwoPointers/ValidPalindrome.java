package org.example.TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindromePractice(String s) {
        return false;







    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "race car";

        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
    public static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int start = 0;
        int end = clean.length() -1;

        while (start <= end) {
            if (clean.charAt(start) != clean.charAt(end)) return false;
            start++;
            end--;
        }
        return true;

    }
}
