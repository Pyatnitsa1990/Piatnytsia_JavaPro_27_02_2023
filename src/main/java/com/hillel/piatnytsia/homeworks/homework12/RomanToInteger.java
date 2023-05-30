package com.hillel.piatnytsia.homeworks.homework12;

import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Short> ROMAN_NUMBERS = Map.of('E', (short) 0,
            'I', (short) 1,
            'V', (short) 5,
            'X', (short) 10,
            'L', (short) 50,
            'C', (short) 100,
            'D', (short) 500,
            'M', (short) 1000);


    public static int romanToInt(String s) {
        s += 'E';
        char[] nums = s.toCharArray();

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            short current = ROMAN_NUMBERS.get(nums[i]);
            short next = ROMAN_NUMBERS.get(nums[i + 1]);

            if (next > current) {
                result += next - current;
                i++;
            } else {
                result += current;
            }
        }
        return result;
    }
}


