package com.niall.interviewqs;

import java.util.Arrays;

/**
 *  Missing Number
 * 
 *  Given an array nums containing n distinct numbers in the range [0, n], 
 *      return the only number in the range that is missing from the array.
 *
 * @author niallcampbell
 */
public class MissingNumber {
    
    public static int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        if(nums[0] != 0) return 0;
        
        for(int i = 0; i < n - 1; i++) {
            if(nums[i+1] - nums[i] != 1) {
                return nums[i+1] - 1;
            }
        }
        
        return nums[n - 1] + 1;
    }
    
    /**
     *  Approach 2:
     * 
     *  Math equation: 1+2+...+n = n*(n+1)/2
     * 
     * @param nums
     * @return 
     */
    public static int missingNumberAlt(int[] nums) {
        
        int n = nums.length;
        
        int total = n * (n + 1) / 2;
        
        int sum = 0;
        
        for(int i : nums) {
            sum += i;
        }
        
        return total - sum;
        
    }
    
}
