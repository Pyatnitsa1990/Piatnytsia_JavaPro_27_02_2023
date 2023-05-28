package com.hillel.piatnytsia.homeworks.homework11;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[][] correctArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] falseSize = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] withText = {{"1", "2", "3", "4"}, {"5", "6", "seven", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] withNull = {{"1", "2", "3", "4"}, {"5", "6", null, "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "15"}};
        Map<String, String[][]> cases = new LinkedHashMap<>();
        cases.put("array is valid", correctArray);
        cases.put("array has wrong size", falseSize);
        cases.put("array contains invalid symbol", withText);
        cases.put("array contains null value", withNull);


        calculateArrays(cases);


    }

    public static void calculateArrays(Map<String, String[][]> cases) {
        cases.forEach((k, v) -> {
            String errMsg = null;
            int result = 0;
            try {
                result = ArrayValueCalculator.checkAndDoCalc(v);
            } catch (RuntimeException ex) {
                //short information about exception
                errMsg = ex.getMessage();
                //all information about exception
                //ex.printStackTrace();
            }
            if (errMsg == null) {
                System.out.printf("case: %s %60s %s\n", k, "result: total amount =", result);
            } else {
                System.err.printf("case: %s %40s %s\n", k, "result: ", errMsg);
            }
        });
    }
}