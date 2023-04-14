package com.hillel.piatnytsia.homeworks.homework5.part1;

import java.util.*;

public class WordStatistics {
    List<WordsPrint> words = new ArrayList<>();

    public void countOccurance(List<String> words, String searchWord) {

        int counter = 0;

        for (String word : words) {
            if (Objects.equals(word, searchWord)) {
                counter++;
            }
        }
        System.out.printf("\nA method that counts the number of times the passed searchWord occurs as the second argument:\n" +
                "number of word matches - %d \n", counter);
    }


    public List<Integer> toList(int[] numberS) {
        List<Integer> numbers = new ArrayList<>(numberS.length);

        for (Integer i : numberS) {
            numbers.add(i);
        }
        System.out.printf("\nConvert an array to a list:\nWas an array %s\nBecame a list %s\n",
                Arrays.toString(numberS), numbers);
        return numbers;
    }


    public List<Integer> findUnique(List<Integer> randomNumbers) {
        List<Integer> unique = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            int counter = 0;

            for (int j = 0; j < randomNumbers.size(); j++) {

                if (randomNumbers.get(i).equals(randomNumbers.get(j))) {
                    counter++;
                }
                if (counter == 1 && j == randomNumbers.size() - 1) {
                    unique.add(randomNumbers.get(i));
                }
            }
        }
        System.out.printf("\nA list containing only unique numbers:\nUnique Numbers " + unique + "\n");
        return unique;
    }


    public void calcOccurance(List<String> randomWords) {
        System.out.println("\nMethod calcOccurance: ");
        List<String> words = new ArrayList<>(randomWords);
        Iterator<String> iterator = words.iterator();

        for (String nextWord : randomWords) {

            int counter = 0;

            while (iterator.hasNext()) {
                String comparisonWord = iterator.next();

                if (nextWord.equals(comparisonWord)) {
                    counter++;
                    iterator.remove();

                }
            }
            iterator = words.iterator();
            if (counter > 0) {
                System.out.printf("\n%s : %d ", nextWord, counter);
            }

        }

    }


    public void add(String name, int counter) {
        words.add(new WordsPrint(name, counter));
    }

    public void findOccurance(List<String> randomWords) {
        System.out.printf("\n\nMethod findOccurance: ");
        List<String> words = new ArrayList<>(randomWords);
        Iterator<String> iterator = words.iterator();

        for (String nextWord : randomWords) {

            int counter = 0;

            while (iterator.hasNext()) {
                String comparisonWord = iterator.next();

                if (nextWord.equals(comparisonWord)) {
                    counter++;
                    iterator.remove();
                }
            }
            iterator = words.iterator();
            if (counter > 0) {
                add(nextWord, counter);
            }

        }
        System.out.println(this.words);
    }

}

