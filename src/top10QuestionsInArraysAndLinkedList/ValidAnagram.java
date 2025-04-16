package top10QuestionsInArraysAndLinkedList;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
//        6. Valid Anagram
//        Question:
//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//                Example:
//        Input: s = "anagram", t = "nagaram"
//        Output: true

        String str1 = "anagram", str2 = "nagaram";
        boolean bkt52 = checkAnagram(str1 , str2);
        System.out.println(bkt52);



//        Boolean b = Arrays.stream(str1.toLowerCase().split("")).sorted().collect(Collectors.joining(""))
//                .equals(Arrays.stream(str2.toLowerCase().split("")).sorted().collect(Collectors.joining("")));
//
//
//
//        System.out.println(b);
    }

    private static boolean checkAnagram(String str1, String str2) {
        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);


        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        String sortedStr1 = new String(chars);

        return  sortedStr1.equals(sortedStr);

    }
}
