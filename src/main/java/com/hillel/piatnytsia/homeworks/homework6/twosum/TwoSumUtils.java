package com.hillel.piatnytsia.homeworks.homework6.twosum;

import java.util.Arrays;

public final class TwoSumUtils {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] numsIndex = {i, j};

                    System.out.println(Arrays.toString(numsIndex));
                    return numsIndex;
                }
            }


        }

        return nums;
    }

}
