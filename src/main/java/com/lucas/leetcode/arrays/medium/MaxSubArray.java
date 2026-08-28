package com.lucas.leetcode.arrays.medium;

public class MaxSubArray {

    //Tenho uma lista de inteiros
    //preciso achar uma sequencia de numeros dentro do array
    //que se somem e deem o maior valor possível
    public int maxSubArray(int[] nums) {
        int sum = nums[0];

        for(int i = 0; i < nums.length; i++) {
            int verify = 0;
            for (int j = i + 1; j < nums.length; j++) {
                verify += nums[j];

                if(verify > sum) {
                    sum = verify;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        MaxSubArray solved = new MaxSubArray();

        System.out.println(solved.maxSubArray(new int[] {-1, -2, -3}));
        System.out.println(solved.maxSubArray(new int[] {12, -11, 6, 3, -10, 2, 7, -1, 9, 3, -5, 7, -2}));
    }
}
