package com.ugv;

import java.util.HashMap;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "BAC";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < ch1.length; i++) {
            if (map1.containsKey(ch1[i])) {
                map1.put(ch1[i], map1.get(ch1[i]) + 1);
            } else {
                map1.put(ch1[i], 1);
            }
            if (map2.containsKey(ch2[i])) {
                map2.put(ch2[i], map2.get(ch2[i]) + 1);
            } else {
                map2.put(ch2[i], 1);
            }
        }

        if (map1.size() != map2.size()) {
            return false;
        }

        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}
