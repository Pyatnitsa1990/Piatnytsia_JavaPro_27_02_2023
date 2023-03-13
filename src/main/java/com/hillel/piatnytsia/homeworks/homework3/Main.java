package com.hillel.piatnytsia.homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        Anagram solution = new Anagram();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("cat", "rat"));
        System.out.println(solution.isAnagram("aacc", "ccac"));
    }

}