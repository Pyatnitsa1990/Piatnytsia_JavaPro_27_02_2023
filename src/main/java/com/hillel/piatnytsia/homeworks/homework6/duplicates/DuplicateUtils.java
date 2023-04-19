package com.hillel.piatnytsia.homeworks.homework6.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class DuplicateUtils {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer num : nums) {
            if (numbers.contains(num)) {
                System.out.println(Arrays.toString(nums));
                System.out.println(true);
                return true;
            }
            numbers.add(num);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(false);
        return false;
    }
}

