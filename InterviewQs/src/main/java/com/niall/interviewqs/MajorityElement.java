package com.niall.interviewqs;

import java.util.Map;
import java.util.HashMap;

/**
 *  Majority Element
 * 
 *  Given an array nums of size n, return the majority element.
 * 
 *  The majority element is the element that appears more than ⌊n / 2⌋ times. 
 *  You may assume that the majority element always exists in the array.
 *
 * @author niallcampbell
 */
public class MajorityElement {
    
    public static int getMajorityElement(final int[] nums) {
        
        if(nums == null || nums.length == 0) return -1;
        
        final Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        
        int majorityElement = -1;
        int occurrences = -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > occurrences) {
                majorityElement = entry.getKey();
                occurrences = entry.getValue();
            }
        }
        
        return majorityElement;
    }
}
