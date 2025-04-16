
package com.mycompany.wordpattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    
   public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];

        
            if (patternToWord.containsKey(ch)) {
                if (!patternToWord.get(ch).equals(word)) {
                    return false; 
                }
            } else {
                patternToWord.put(ch, word);
            }

        
            if (wordToPattern.containsKey(word)) {
                if (wordToPattern.get(word) != ch) {
                    return false; 
                }
            } else {
                wordToPattern.put(word, ch);
            }
        }

        return true;
    }
    
    

    public static void main(String[] args) {
        String pattern="abba";
       String s = "dog cat cat dog";
        
        System.out.println(wordPattern(pattern,s));
    }
    
    
    
    
}
