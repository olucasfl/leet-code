package com.lucas.leetcode.arrays.easy;

public class ContainsDuplicate {

    public boolean cointainsDuplicate(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();

        System.out.println(sol.cointainsDuplicate(new int[]{1, 2, 3, 1, 4, 5}));
    }

}
