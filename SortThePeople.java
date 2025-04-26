

package com.mycompany.sortthepeople;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SortThePeople {
    
    
    public static String[] sortThePeople(String[] name, int[] height){
     Map<Integer, String> map = new HashMap<>();
     
     for(int i=0; i<name.length; i++){
         map.put(height[i], name[i] );
     }
     Arrays.sort(height);
     String[] sortedNames = new String[name.length];
        
        int index =0;
        for(int i=height.length-1; i>=0; i--){
            sortedNames[index] = map.get(height[i]);
            index++;
            
        }
        return sortedNames;
        
    }

    public static void main(String[] args) {
        String[] name = {"rahim", "korim","kamal "};
          int[] height = {100, 120,90};
        
        System.out.println( sortThePeople(name,height));
    }
}
