package com.hillel.piatnytsia.homeworks.homework5.part1;

import java.util.*;

public class WordStatistics {
    List<WordsPrint> word = new ArrayList<>();

    public void countOccurance(List<String> words, String searchWord) {

        int counterRepeatWord = 0;

        for (String word : words) {
            if (Objects.equals(word, searchWord)) {
                counterRepeatWord++;
            }
        }
        System.out.printf("\nA method that counts the number of times the passed searchWord occurs as the second argument:\n" +
                "number of word matches - %d \n", counterRepeatWord);
    }


    public List<Integer> toList(int[] number) {
        List<Integer> numbers = new ArrayList<>(number.length);

        for (Integer i : number) {
            numbers.add(i);
        }
        System.out.printf("\nConvert an array to a list:\nWas an array %s\nBecame a list %s\n",
                Arrays.toString(number), numbers);
        return numbers;
    }


    public List<Integer> findUnique(List<Integer> randomNumbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            int counter = 0;

            for (int j = 0; j < randomNumbers.size(); j++) {

                if (randomNumbers.get(i).equals(randomNumbers.get(j))) {
                    counter++;
                }
                if (counter == 1 && j == randomNumbers.size() - 1) {
                    uniqueNumbers.add(randomNumbers.get(i));
                }
            }
        }
        System.out.printf("\nA list containing only unique numbers:\nUnique Numbers " + uniqueNumbers + "\n");
        return uniqueNumbers;
    }


    public void calcOccurance(List<String> randomWords) {
        System.out.println("\nMethod calcOccurance: ");
        List<String> words = new ArrayList<>(randomWords);
        Iterator<String> iterator = words.iterator();

        for (String nextWord : randomWords) {

            int counterRepeatWord = 0;

            while (iterator.hasNext()) {
                String containsWord = iterator.next();

                if (nextWord.equals(containsWord)) {
                    counterRepeatWord++;
                    iterator.remove();

                }
            }
            iterator = words.iterator();
            if (counterRepeatWord > 0) {
                System.out.printf("\n%s : %d ", nextWord, counterRepeatWord);
            }

        }

    }


    public void add(String name, int counter) {
        word.add(new WordsPrint(name, counter));
    }

    public void findOccurance(List<String> randomWords) {
        System.out.printf("\n\nMethod findOccurance: ");
        List<String> words = new ArrayList<>(randomWords);
        Iterator<String> iterator = words.iterator();

        for (String nextWord : randomWords) {

            int counterRepeatWord = 0;

            while (iterator.hasNext()) {
                String containsWord = iterator.next();

                if (nextWord.equals(containsWord)) {
                    counterRepeatWord++;
                    iterator.remove();
                }
            }
            iterator = words.iterator();
            if (counterRepeatWord > 0) {
                add(nextWord, counterRepeatWord);
            }

        }
        System.out.println(word);
    }

}

