package com.hillel.piatnytsia.homeworks.homework11;


public class ArrayValueCalculator {

    public static int checkAndDoCalc(String[][] numbers) {
        checkArraySize(numbers);
        return doCalc(numbers);
    }


    private static int doCalc(String[][] numbers) {
        int totalAmount = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totalAmount += parseInt(numbers[i][j], i, j);
            }
        }
        return totalAmount;
    }

    private static void checkArraySize(String[][] numbers) {
        if (numbers.length != 4)
            throw new ArraysSizeException("Wrong size array!");

        for (String[] array : numbers) {
            if (array.length != 4)
                throw new ArraysSizeException("Wrong size array!");
        }
    }


    private static int parseInt(String val, int i, int j) {
        int result;
        try {
            result = Integer.parseInt(val);
        } catch (NumberFormatException ex) {
            throw new ArrayDataException("invalid value " + val + " i=" + i + " j=" + j, ex);
        }
        return result;
    }


}
