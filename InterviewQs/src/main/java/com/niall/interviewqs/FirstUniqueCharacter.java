package com.niall.interviewqs;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 *  First Unique Character in a String. 
 * 
 *  Given a string s, find the first non-repeating character in it and return its index.
 * 
 *  If it does not exist, return -1.
 *  
 * @author niallcampbell
 */
public class FirstUniqueCharacter {
    
    public static int firstUniqChar(String s) {
        
        Set<Character> set = new HashSet<>();
        
        List<Character> list = new ArrayList<>();
        
        char[] chars = s.toCharArray();
        
        for(Character c : chars) {
            if(set.add(c)) {
                list.add(c);
            } else {
                list.remove(c);
            }
        }
        
        if(list.isEmpty()) return -1;
        
        char c = list.get(0);
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) return i;
        }
        
        return -1;
    }
    
}
