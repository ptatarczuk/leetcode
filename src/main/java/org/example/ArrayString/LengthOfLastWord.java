package org.example.ArrayString;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.stripTrailing();

        int i = s.length() - 1;
        int size = 0;

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
