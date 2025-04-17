package com.mycompany.validanagram;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int[] arr = new int[26];

        if (sl != tl) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            System.out.println("arr --- : " + arr[s.charAt(i) - 'a']);
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
            System.out.println("arr --- : " + arr[s.charAt(i) - 'a']);
            
        }
          for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abbc";
        String t = "abcb";
        isAnagram(s, t);

       
    }
}
