package review_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Palindrome {
    public static void main(String[] args) {
            /*
        remove palindrome strings from a List of String
    */


        List<String> words = new ArrayList<>();
        words.add("level");
        words.add("hello");
        words.add("madam");
        words.add("world");
        words.add("deed");

        removePalindromes(words);
         System.out.println(words);


    }
    public static List<String> removePalindromes(List<String> words) {


//
//        List<String> result = new ArrayList<>();
//
//        for (String word : words) {
//            if (!isPalindrome(word)) {
//                result.add(word);
//            }
//        }
//
//        return result;
        words.removeIf(word -> isPalindrome(word));


        return words;
    }
    public static boolean isPalindrome(String word) {
        int first = 0;
        int last = word.length() - 1;

        while (first < last) {
            if (word.charAt(first) != word.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }

        return true;
    }
}
