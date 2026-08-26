package com.lucas.leetcode.arrays.easy;

public class FindMaxMin {

    // recebo uma lista de inteiro
    //preciso olhar todos os numeros e guardar o maior
    //olho novamente e guardo o menor
    public int[] findMinMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        return new int[] {min, max};
    }

    public static void main(String[] args) {
        FindMaxMin solved = new FindMaxMin();
        int[] resultado = solved.findMinMax(new int[]{1, -2, 3, 4, 5, 2, 4, 13, 7, 12, 13});

        System.out.println("Min: " + resultado[0] + ", Max: " + resultado[1]);
    }
}
