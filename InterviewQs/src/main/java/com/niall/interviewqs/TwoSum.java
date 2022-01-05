package com.niall.interviewqs;

import java.util.HashMap;
import java.util.Map;

/**
 *  Two Sum Q from LeetCode.
 * 
 *  Given an array of integers nums and an integer target, return the indices of the two numbers 
 *      in the array that add up to the target value.
 * 
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 *  You can return the answer in any order.
 *  
 */
public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) return null;
    
        int[] answer = new int[2];
        
        // key = arrayVal, value = indexOfArrayVal
        Map<Integer, Integer> map = new HashMap<>();
        
        int requiredNum = 0;
        
        for(int i = 0; i < nums.length; i++) {
        
            requiredNum = target - nums[i];
            
            if(map.containsKey(requiredNum)) {
                answer = new int[] {i, map.get(requiredNum)};
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        
        return answer;
    
    }
    
}
