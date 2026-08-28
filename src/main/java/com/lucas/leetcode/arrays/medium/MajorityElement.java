package com.lucas.leetcode.arrays.medium;

public class MajorityElement {

    //Recebo um array de numeros
    //preciso achar o numero que aparece mais vezes que lenght/2

    //passo um for pegando um numero e outro verificando se tem iguais a ele
    //se tiver igual eu guardo a quantidade
    public int majorityElement(int[] nums) {
        int quantityMemory = 1;
        int number = nums[0];


        for(int i = 0; i < nums.length; i++) {
            int quantity = 1;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    quantity++;
                }
            }

            if (quantity > quantityMemory) {
                quantityMemory = quantity;
                number = nums[i];
            }
        }

        if(quantityMemory > nums.length / 2) {
            return number;
        }

        return -1;
    }

    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        System.out.println(sol.majorityElement(new int[]{3, 2, 3}));
        System.out.println(sol.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(sol.majorityElement(new int[]{1, 1, 2, 2}));
    }
}
