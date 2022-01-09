package com.niall.interviewqs;

import java.util.Arrays;

/**
 * 
 *  Question:
 *  
 *  You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 *  and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * 
 *  Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 *  The final sorted array should be stored inside the array nums1.
 *  To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
 *  and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * 
 *  Example:
 * 
 *  Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 *  Output: [1,2,2,3,5,6]
 *
 * @author niallcampbell
 */
public class MergeSortedArray {
    
    public static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        
        Arrays.sort(nums1);
        
        return nums1;
        
    }
    
}
