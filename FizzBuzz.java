

package com.mycompany.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
     public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        
        for(int i=1; i<=100; i++){
            if(i%3==0){
                ans.add("Fizz");
//                System.out.println( i+ " = "+ "Fizz");
            }else if(i%5==0){
                 ans.add("Buzz");
//                  System.out.println(i+ " = "+"Buzz");
                
            }else if( i%3==0 && i%5==0){
                ans.add("Fizz Buzz");
//                  System.out.println(i+ " = "+" Fizz Buzz");
                
            }else{
                ans.add(String.valueOf(i));
//                System.out.println(i+ " = "+"nothing");
            }
            
       
        }
             return ans;
        
       
    }

    public static void main(String[] args) {
        int n=100;
        
       
         System.out.println(fizzBuzz(n));
       
    }
}
