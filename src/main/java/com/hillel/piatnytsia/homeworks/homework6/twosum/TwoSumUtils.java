package com.hillel.piatnytsia.homeworks.homework6.twosum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    public static int[] twoSumVersion2(int[] nums, int target) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            if(numbers.contains(target -nums[i])){
                for (int j = 0; j <nums.length ; j++) {
                    if(nums[j]==target-nums[i]){
                        return new int[]{i,j};
                    }
                }
            }
            numbers.add(nums[i]);
        }

        return nums;
    }
}
