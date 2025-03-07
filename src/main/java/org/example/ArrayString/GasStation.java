package org.example.ArrayString;

/* https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150 */

public class GasStation {
    public static int canCompleteCircuitPractice(int[] gas, int[] cost) {
        return -1;










    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,1};

        //System.out.println(canCompleteCircuit(gas,cost));
        System.out.println(canCompleteCircuitPractice(gas,cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalSurplus = 0;
        int surplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            totalSurplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }

        }
        return totalSurplus >= 0 ? start : -1;
    }


}
