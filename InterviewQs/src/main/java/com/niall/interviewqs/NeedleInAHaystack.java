package com.niall.interviewqs;

/**
 * 
 *  Implement strStr() Question
 * 
 *  Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 *  Return 0 when needle is an empty string. 
 *
 * @author niallcampbell
 */
public class NeedleInAHaystack {
    
    public static int strStr(String haystack, String needle) {
        
        if(needle.equals("")) return 0;
        
        if(!haystack.contains(needle)) return -1;
        
        return haystack.indexOf(needle);
    }
    
}
