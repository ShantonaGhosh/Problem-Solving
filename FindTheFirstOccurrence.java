package com.mycompany.findthefirstoccurrence;

public class FindTheFirstOccurrence {

    public static int findtheFirstOccurrence(String hayStack, String needle) {

           if(hayStack.length() < needle.length()){
                   return -1;
           }
           
           for(int i=0; i<= (hayStack.length()-needle.length()) ; i++){
               String subStr =  hayStack.substring(i, i+needle.length());
               if( subStr.equals(needle)){
                   return i;
               }
               
           }
           
        return -1;

    }

    public static void main(String[] args) {
        String hayStack = "sasadtsad";
        String needle = "sad";
        System.out.println(findtheFirstOccurrence(hayStack, needle));
    }
}
