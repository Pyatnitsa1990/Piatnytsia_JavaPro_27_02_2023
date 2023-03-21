package com.hillel.piatnytsia.homeworks.homework3;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        System.out.println("\nDetermining the anagram between " + s + " and " + t);
        if (s.length() != t.length()) {
            return false;
        }
        byte[] letters = new byte[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for (int i : letters) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}


