

package com.mycompany.decryptstring;

public class DecryptString {
    
    public static String decrytString(String s){
        StringBuilder sb =new StringBuilder();
        int n= s.length();
        int i=0;
        
        while(i<n){
            if((i+2)<n && s.charAt(i+2)=='#'){
                String str = s.substring(i, i+2);
                int tmp= Integer.parseInt(str);
                char ch = (char)(tmp+96);
                sb.append(ch);
                i=i+3;
            }else{
                char ch =s.charAt(i);
                sb.append((char) (ch+48));
                i++;
            }
            
        }
        
        
        return sb.toString();
        
        
    }
    
    
    
    
    
    
    

    public static void main(String[] args) {
        
        
        System.out.println(decrytString("10#11#12"));
    }
}
