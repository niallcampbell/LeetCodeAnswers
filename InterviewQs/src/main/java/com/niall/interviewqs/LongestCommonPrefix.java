package com.niall.interviewqs;

import java.util.Arrays;

/**
 * 
 *  Longest common prefix.
 * 
 *  Find the longest common prefix string amongst an array of strings. 
 *
 * @author niallcampbell
 */
public class LongestCommonPrefix {
    
    /**
     *  Approach:
     * 
     *  Find the shortest word. 
     *  Compare to all other words.
     *  Store the characters that are common to all. 
     * 
     *  Complexity: On^2
     *  
     *  @param strs
     *  @return String
     */
    public static String getlongestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) return "";
        
        String prefix = "";
        String shortestWord = strs[0];
        
        for(String s : strs) {
            if(s.length() < shortestWord.length()) shortestWord = s;
        }
        
        for(int i = 0; i < shortestWord.length(); i++) {
            char c = shortestWord.charAt(i);
            boolean match = true;
            
            for(String s : strs) {
                if(s.charAt(i) != c) {
                    match = false;
                    break;
                }
            }
            
            if(match) {
                prefix = prefix + c;
            } else {
                break;
            }
        }
        
        return prefix;
    }
    
    /**
     *  Alternative approach:
     * 
     *  Sort the array. 
     *  Find the shortest word and the longest word. 
     *  Compare them for the longest prefix. 
     * 
     *  @param strs
     *  @return 
     */
    public static String getLongestCommonPrefixAlt(String[] strs) {
        
        if(strs == null || strs.length == 0) return "";
        
        String prefix = "";
        
        Arrays.sort(strs);
        
        String shortestWord = strs[0];
        String longestWord = strs[strs.length - 1];
        
        int i = 0;
        while(i < shortestWord.length() && shortestWord.charAt(i) == longestWord.charAt(i)) {
            prefix += shortestWord.charAt(i);
            i++;
        }
        
        return prefix;
    }
    
}
