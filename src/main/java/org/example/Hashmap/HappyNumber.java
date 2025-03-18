package org.example.Hashmap;

import java.util.HashSet;

/* https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150 */
public class HappyNumber {
    public static boolean isHappyPractice(int n) {

        return false;




    }

    public static void main(String[] args) {
        int n = 12;

        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
