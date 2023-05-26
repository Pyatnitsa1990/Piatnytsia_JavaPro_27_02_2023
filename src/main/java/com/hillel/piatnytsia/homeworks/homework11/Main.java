package com.hillel.piatnytsia.homeworks.homework11;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] falseSize = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        String[][] withText = {{"1", "2", "3", "4"}, {"5", "6", "seven", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15"}};
        String[][] withNull = {{"1", "2", "3", "4"}, {"5", "6", null, "8"}, {"9", "10", "11", "12"}, {"13", "14", "15"}};


        ArrayValueCalculator.doCalc(withNull);
    }
}