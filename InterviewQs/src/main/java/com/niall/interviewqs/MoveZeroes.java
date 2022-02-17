package com.niall.interviewqs;

/**
 *  Move Zeroes Question
 * 
 *  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 *  Note that you must do this in-place without making a copy of the array.
 * 
 *  Example:
 * 
 *  Input: nums = [0,1,0,3,12]
 *  Output: [1,3,12,0,0]
 * 
 *
 * @author niallcampbell
 */
public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        
        int end = nums.length - 1;
        int current = 0;
        
        for(int i = 0; i <= end; i++) {
            if(nums[i] != 0) {
                nums[current] = nums[i];
                current++;
            }
        }
        
        while(current <= end) {
            nums[current] = 0;
            current++;
        }  
    }
    
}
