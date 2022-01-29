package com.niall.interviewqs;

/**
 *  Merge two sorted arrays
 * 
 *  Given two sorted arrays, return a new array with both of them merged together. 
 *
 * @author niallcampbell
 */
public class MergeTwoSortedArrays {
    
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        
        int[] c = new int[a.length + b.length];
        
        int i = 0, j = 0, k = 0;
        
        while(i < a.length && j < b.length) {
            
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            
            k++;
        }
        
        while(i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        
        while(j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        
        return c;
        
    }
    
}
