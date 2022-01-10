package com.niall.interviewqs;

import java.util.Arrays;

/**
 * 
 *  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * @author niallcampbell
 */
public class ValidAnagram {
    
    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] cs = s.toCharArray();
        char[] ct= t.toCharArray();
        
        Arrays.sort(cs);
        Arrays.sort(ct);
        
        for(int i = 0; i < cs.length; i++) {
            if(cs[i] != ct[i]) return false;
        }
        
        return true;
    }
    
}
