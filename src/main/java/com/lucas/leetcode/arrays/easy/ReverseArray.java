package com.lucas.leetcode.arrays.easy;

import java.util.Arrays;

public class ReverseArray {

    //tenho um array com varios numeros e preciso inverter
    //olho o ultimo número com .length e adiciono na nova lista
    public int[] reverseArray(int[] nums) {
        int[] reverse = new int[nums.length];
        int j = 0;

        for(int i = nums.length - 1; i >= 0; i--) {
            reverse[j] = nums[i];
            j++;
        }

        return reverse;
    }

    public static void main(String[] args) {
        ReverseArray solved = new ReverseArray();

        System.out.println(Arrays.toString(solved.reverseArray(new int[] {10, 7, 18, 14, 5, 4, 3, 2, 1})));
    }
}
