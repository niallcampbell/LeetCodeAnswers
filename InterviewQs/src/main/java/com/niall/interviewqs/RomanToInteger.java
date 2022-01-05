package com.niall.interviewqs;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *  Convert Roman Numeral to Integer.
 * 
 *  Approach:
 * 
 *  Work back to front. 
 *  If the letter is bigger or equal to the previous, add it to the sum. 
 *  If the letter is smaller, then subtract it from the sum. 
 *  
 */
public class RomanToInteger {
    
    final static Map<Character, Integer> symbolMap = new HashMap<>();
    
    static {
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
    }
    
    public static int romanToInt(final String s) {
        
        if(s == null || s.length() == 0) return -1;
        
        final char[] array = s.toCharArray();
        final int length = array.length;
        int sum = 0;
        int value = 0;
        int prev = -1;
        
        for(int i = length - 1; i > -1; i--) {
            value = getSymbolValue(array[i]);
            if(value >= prev) {
                sum += value;
                prev = value;
            } else {
                sum -= value;
                prev = value;
            }
        }
        return sum;
    }
    
    private static int getSymbolValue(final char symbol) {
        return symbolMap.get(symbol);
    }
    
}
