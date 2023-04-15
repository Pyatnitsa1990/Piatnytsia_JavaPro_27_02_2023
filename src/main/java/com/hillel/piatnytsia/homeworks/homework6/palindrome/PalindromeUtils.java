package com.hillel.piatnytsia.homeworks.homework6.palindrome;

public final class PalindromeUtils {
    @Override
    public String toString() {
        return "Palindrome{}";
    }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
            if (!(chars[i] == chars[j])) {
                System.out.printf("\n%s is not a palindrome.", s);
                return false;
            }
        }

        System.out.printf("\n%s is a palindrome.", s);
        return true;
    }
}
