package com.niall.interviewqs;

import java.util.Set;
import java.util.HashSet;

/**
 *  Contains Duplicate Q
 * 
 *  Given an integer array nums, return true if any value 
 *      appears at least twice in the array, 
 *          and return false if every element is distinct.
 *
 * @author niallcampbell
 */
public class ContainsDuplicate {
    
    public static boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        
        return false;
    }
    
}
