package com.niall.interviewqs;

import java.util.Map;
import java.util.HashMap;

/**
 *  Not a Leet Code Q
 * 
 *  Given an array of integers, and a number ‘sum’, 
 *  find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 *  
 * @author niallcampbell
 */
public class CountPairsWithGivenSum {
    
    
    public static int countPairs(int [] array, int sum) {
        
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < array.length; i++) {
            
            if(map.containsKey(sum - array[i])) {
                count += map.get(sum - array[i]);
            } else if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        
        return count;
    }
    
}
