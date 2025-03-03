package org.example.ArrayString;
import java.util.Arrays;


/* https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150 */
public class HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;

        while (idx < n && n - idx > citations[idx]) {
            idx++;
        }
        return n - idx;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};

        System.out.println(hIndex(citations));
    }
}
