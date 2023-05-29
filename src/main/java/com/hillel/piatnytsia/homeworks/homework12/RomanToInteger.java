package com.hillel.piatnytsia.homeworks.homework12;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100,'D', 500, 'M', 1000);
        int previousValue = 0;
        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (Map.Entry<Character, Integer> entry : romanNumbers.entrySet()) {

                Character key = entry.getKey();
                if (key.equals(charArray[i])) {
                    Integer value = entry.getValue();
                    if (i==0 || value <=previousValue){
                        result+=value;
                        previousValue = value;
                    } else{

                        result+=value-2*previousValue;
                        previousValue = value;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
