package org.example.ArrayString;

/* https://leetcode.com/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150 */
public class IntegerToRoman {
    public static String intToRomanPractice(int num) {
        return "";










    }

    public static void main(String[] args) {
        int num1 = 3749;
        int num2 = 56;

        //System.out.println(intToRoman(num1));
        //System.out.println(intToRoman(num2));
        System.out.println(intToRomanPractice(num1));
        System.out.println(intToRomanPractice(num2));
    }
    public static String intToRoman(int num) {
        int[] arabic = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman = {"I", "IV", "V", "IX","X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder sb = new StringBuilder();

        for (int i = arabic.length -1 ; i >= 0 && num >= 0; i--) {
            while (num >= arabic[i]) {
                num -= arabic[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }


}
