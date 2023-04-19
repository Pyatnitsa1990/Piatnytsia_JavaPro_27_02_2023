package com.hillel.piatnytsia.homeworks.homework6.palindrome;


public class Main {
    public static void main(String[] args) {
        String checkTruth = "A man, a plan, a canal: Panama";
        String checkFalse = "race a car";

        PalindromeUtils.isPalindrome(checkTruth);
        PalindromeUtils.isPalindrome(checkFalse);

    }
}
