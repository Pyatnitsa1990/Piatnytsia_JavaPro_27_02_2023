package com.hillel.piatnytsia.homeworks.homework5.part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> randomWords = Arrays.asList(null, "box", "fish", "bird", "fox", "fish1", "cat", "dog", "box", "fish", "plan", "train", "apple", "lemon", "box");
        String searchWord = "fish";
        WordStatistics wordStatistics = new WordStatistics();
        wordStatistics.countOccurance(randomWords, searchWord);

        int[] numbers = {1, 2, 3};
        wordStatistics.toList(numbers);

        List<Integer> randomNumbers = Arrays.asList(1, 2, 2, 4, 5, 6, 9, 13, 4, 9);
        wordStatistics.findUnique(randomNumbers);


        List<String> wordsForCalcOccurance = new LinkedList<>(Arrays.asList("box", "fish", "bird", "fox", "lion", "cat", "dog", "box", "car", "fox", "train", "bird", "lemon", "box"));
        wordStatistics.calcOccurance(wordsForCalcOccurance);

        

        List<String> wordsForFindOccurance = new ArrayList<>(Arrays.asList("cap", "door", "window", "tiger", "tiger", "cat", "door", "box", "cap", "tiger", "train", "bird", "lemon", "box"));
        wordStatistics.findOccurance(wordsForFindOccurance);

    }
}