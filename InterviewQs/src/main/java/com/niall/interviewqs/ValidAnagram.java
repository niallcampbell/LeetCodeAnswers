package com.niall.interviewqs;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * 
 *  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * @author niallcampbell
 */
public class ValidAnagram {
   
    /**
     *  Approach 1
     * 
     *  Complexity: Arrays.sort() uses quicksort and is O(n log n)
     * 
     * @param s
     * @param t
     * @return 
     */
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
    
    /**
     *  Approach 2:
     * 
     *  Put both sets of characters into HashMaps and compare them.
     * 
     *  Complexity: O(n)
     * 
     * @param s
     * @param t
     * @return 
     */
    public static boolean isAnagramAlt(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(!smap.containsKey(cs[i])) {
                smap.put(cs[i], 1);
            } else {
                smap.put(cs[i], smap.get(cs[i]) + 1);
            }
            
            if(!tmap.containsKey(ct[i])) {
                tmap.put(ct[i], 1);
            } else {
                tmap.put(ct[i], tmap.get(ct[i]) + 1);
            }
        }
        
        return smap.equals(tmap);
    }
    
}
