package com.niall.interviewqs;

import java.util.Map;
import java.util.HashMap;

/**
 *  Single Number Q
 * 
 *  Given a non-empty array of integers nums, 
 *      every element appears twice except for one. Find that single one.
 *
 * @author niallcampbell
 */
public class SingleNumber {
    
    public static int singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!(map.containsKey(nums[i]))) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        int val = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                val = entry.getKey();
            }
        }
        
        return val;
    }
    
}
