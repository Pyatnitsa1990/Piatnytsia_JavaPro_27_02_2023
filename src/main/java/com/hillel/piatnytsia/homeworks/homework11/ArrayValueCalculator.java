package com.hillel.piatnytsia.homeworks.homework11;

import java.io.FileNotFoundException;
import java.util.Arrays;


class ArrayDataException extends RuntimeException {

    public ArrayDataException(String msg, Throwable ex) {
        super(msg, ex);
    }


}

class ArraysSizeException extends RuntimeException {
    public ArraysSizeException(String msg) {
        super(msg);
    }
}

public class ArrayValueCalculator {

    public static void doCalc(String[][] numbers) {
        int totalAmount = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (!(numbers.length == 4) || !(numbers[i].length == 4)) {
                    throw new ArraysSizeException("Wrong size array!");
                } else {
                    totalAmount += parseInt(numbers[i][j], numbers.length, numbers[i].length);

                }
            }
        }
        System.out.println("Total Amount " + totalAmount);

    }

    public static int parseInt(String val, int i, int j) {
        int result = 0;

        try {
            result += Integer.parseInt(val);

        } catch (NumberFormatException ex) {
            throw new ArrayDataException("invalid value " + val + " i=" + i + " j=" + j, ex);
        }

        return result;
    }


}
