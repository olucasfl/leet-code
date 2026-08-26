package com.lucas.leetcode.arrays.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CountEvans {

    public List<Integer> countEvans(int[] nums) {
        List<Integer> evans = new ArrayList<>();

        for(int num : nums) {
            if(num % 2 == 0) {
                evans.add(num);
            }
        }

        return evans;
    }

    public static void main(String[] args) {
        CountEvans countEvans = new CountEvans();
        List<Integer> evans = countEvans.countEvans((new int[]{1, 2, 3, 14, 55, 68, 102, 1058, 1112, 7, 4, 2, 9, 18}));

        System.out.println("Pares: " + evans);
        System.out.println("Quantidade: " + evans.size());
    }
}
