package com.niall.interviewqs;

/**
 *  Reverse String Q:
 * 
 *  Write a function that reverses a string. The input string is given as an array of characters s.
 * 
 *  You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * @author niallcampbell
 */
public class ReverseString {
    
    public static char[] reverseString(char[] s) {
        
        int i = 0;
        int j = s.length - 1;
        char temp = 'a';
        
        while(i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
        return s;
    }
    
}
