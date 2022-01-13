package com.niall.interviewqs;

/**
 *  Maximum sub-array Question
 * 
 *  Given an integer array nums, find the contiguous subarray (containing at least one number) 
 *      which has the largest sum and return its sum.
 * 
 *  Contiguous = together in sequence, beside each other. 
 * 
 *
 * @author niallcampbell
 */
public class MaximumSubArray {
    
    /**
     *  Can be solved using Kadane’s Algorithm. 
     * 
     *  Iterate through the array. 
     * 
     *  Keep track of the current sum and the largest sum of the elements found so far. 
     * 
     *  If the current sum is largest than the max sum found so far, set max sum to current sum. 
     * 
     *  If at some point the current sum becomes negative, reset it to 0. 
     * 
     * @param nums
     * @return 
     */
    public static int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int maxSumSoFar = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i = 0; i < n; i++){
            currSum += nums[i];
            maxSumSoFar = Math.max(currSum,maxSumSoFar);
            if(currSum<0) currSum = 0;
        }
        
        return maxSumSoFar;
    }
    
}
