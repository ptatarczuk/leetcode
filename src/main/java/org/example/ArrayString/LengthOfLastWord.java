package org.example.ArrayString;

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
    public static int lengthOfLastWordForLoop(String s) {
        s = s.stripTrailing();
        int size = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboys";

        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWordForLoop(s));
    }
}
