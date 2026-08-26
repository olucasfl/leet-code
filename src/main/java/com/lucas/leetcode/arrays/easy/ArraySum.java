package com.lucas.leetcode.arrays.easy;

public class ArraySum {

    public int arraySum(int[] nums) {
        int total = 0;

        for(int num : nums) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();

        System.out.println(arraySum.arraySum(new int[]{1, -2, 3, 4}));
    }
}
