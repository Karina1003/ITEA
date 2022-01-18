package com.karinapinchuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        //task 1
        String str = "ARSTSRA";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        //task 2
        String str1 = "Java Exercises and";
        String str2 = "Python Exercises";
        System.out.println(concat(str1, str2));
        //task 3
        String stringA = "This is exercise 1";
        String stringB = "This Is Exercise 1";
        if (equalStrings(stringA, stringB)) {
            System.out.println(stringA + " is equal to " + stringB);
        } else {
            System.out.println(stringA + " isn`t equal to " + stringB);
        }
        //task 4
        String string4 = "This is Java course";
        System.out.println(evenPositions(string4));
        //task 5
        String [] strings1 = new String[5];
        strings1[0] = "Rabbit";
        strings1[1] = "Job";
        strings1[2] = "Bribe";
        strings1[3] = "Bride";
        strings1[4] = "Food";
        System.out.println(words(strings1, "bib"));
    }

    public static boolean isPalindrome (String a) {
        char[] chars = a.toCharArray();
        int start = 0, end = chars.length-1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static String concat (String str1, String str2) {
        return str1 + " " + str2;
    }
    public static boolean equalStrings (String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
    public static String evenPositions (String str) {
        StringBuilder strb = new StringBuilder();
        char[] ch = str.toCharArray();
        int i = 0;
        for (char c : ch) {
            if (i % 2 == 0 && c != ' ') {
                strb.append(c);
            }
            if (c == ' ') {     //Пробелы не входят в подсчёт
                i--;
                strb.append(" ");
            }
            i++;
        }
        return strb.toString();
    }
    public static List<String> words (String[] strArray, String letters) {
        List<String> rightWords = new ArrayList<>();
        for(String str:strArray) {
            int relevantLetter = 0;       //flag for relevant words
            int countLetters = 0;   //flag for counting relevant letters
            char[] ch = str.toCharArray();
            Map<Character, Integer> countWordMap = new HashMap<>();
            for (char c : ch) {
                if (!countWordMap.containsKey(Character.toLowerCase(c))) {
                    countWordMap.put(Character.toLowerCase(c), 1);
                } else {
                    countWordMap.replace(Character.toLowerCase(c), countWordMap.get(Character.toLowerCase(c)) + 1);
                }
            }
            char[] ch1 = letters.toCharArray();
            Map<Character, Integer> countLettersMap = new HashMap<>();
            for (char c : ch1) {
                if (!countLettersMap.containsKey(Character.toLowerCase(c))) {
                    countLettersMap.put(Character.toLowerCase(c), 1);
                } else {
                    countLettersMap.replace(Character.toLowerCase(c), countLettersMap.get(Character.toLowerCase(c)) + 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : countLettersMap.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();
                countLetters++;
                for (Map.Entry<Character, Integer> entry1 : countWordMap.entrySet()) {
                    char key1 = entry1.getKey();
                    int value1 = entry1.getValue();
                    if (key == key1 && value <= value1) {
                        relevantLetter++;
                    }
                }
            }
            if (countLetters == relevantLetter) {
                rightWords.add(str);
            }
        }
        return rightWords;
    }
}
