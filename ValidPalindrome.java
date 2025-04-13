

package com.mycompany.validpalindrome;


public class ValidPalindrome {
    
    public static boolean checkPalindrome(String s1){
        
        String s = s1.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb =new StringBuilder(s);
        
        String s2 = sb.reverse().toString();
        if(s.equals(s2)){
            return true;
        }
        
        return false;
        
    }
    

    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam"));
    }
}
