

package com.mycompany.happynumber;

import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
    
    public static boolean happyNumber(int n){
        Set<Integer> data = new HashSet<>();
        
        while(true){
            int sum =0;
            while(n !=0){
            sum += Math.pow(n%10,2);
            n=n/10;
            
        }
            if(sum==1) return true;
            n=sum;
            if(data.contains(n)){
                return false;
               
            }
             data.add(n);
            
        }
        
    } 
    
    

    public static void main(String[] args) {
        System.out.println(happyNumber(2));
    }
}
