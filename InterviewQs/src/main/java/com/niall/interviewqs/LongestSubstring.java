package com.niall.interviewqs;

import java.util.Set;
import java.util.HashSet;

/**
 *  Longest Substring Without Repeating Characters
 * 
 *  Given a string s, find the length of the longest substring without repeating characters.
 * 
 *
 * @author niallcampbell
 */
public class LongestSubstring {
    
    /**
     *  Check the length of each unique substring. 
     * 
     *  Return the largest length. 
     * 
     * @param s
     * @return 
     */
    public static int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 1) return 1;
        
        Set<Character> visited = new HashSet<>();
        
        int max= 0, curr = 0;
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(visited.add(s.charAt(j))) {
                   curr++; 
                } else {
                    visited.clear();
                    break;
                }
            }
            max = Math.max(max, curr);
            curr = 0;
        }
        
        return max;
    }
    
}
