package com.hillel.piatnytsia.homeworks.homework12;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int previousValue = 0;
        int result = 0;
        int count = 0;
        char[] inputValue = s.toCharArray();
        for (char c : inputValue) {
            if (romanNumbers.containsKey(c)) {
                Integer value = romanNumbers.get(c);
                if (count == 0 || value <= previousValue) {
                    result += value;
                    previousValue = value;
                    count++;
                } else {

                    result += value - 2 * previousValue;
                    previousValue = value;
                    count++;
                }
            }
        }

        System.out.println(result);
        return result;
    }
}

