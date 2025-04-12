
package com.mycompany.romantoint;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    
 public static int romanToInt(String s) {
     
     Map<Character,Integer> romanValues=new HashMap<>();
   
    romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
          int total = romanValues.get(s.charAt(s.length()-1));
        
        for(int i =s.length()-2; i>=0; i--){
     if(romanValues.get(s.charAt(i+1)) > romanValues.get(s.charAt(i))) {
         total =total - romanValues.get(s.charAt(i));
     }else{
          total =total + romanValues.get(s.charAt(i));
         
     }
 }
        return total;
        
    }
    
    

    public static void main(String[] args) {
        String s= "MCMXCIV";
       int total= romanToInt(s);
        System.out.println("output" +total);
    }
}
