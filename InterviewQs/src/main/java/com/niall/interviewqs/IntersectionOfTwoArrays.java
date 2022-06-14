package com.niall.interviewqs;

import java.util.ArrayList;

/**
 * 
 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 *
 * @author niallcampbell
 */
public class IntersectionOfTwoArrays {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> common = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    common.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        
        int[] arr = new int[common.size()];
        for(int i = 0; i < common.size(); i++) {
            arr[i] = common.get(i);
        }
        
        return arr;
    }
    
}
