package com.niall.interviewqs;

/**
 *  Write a function that takes an unsigned integer and 
 *      returns the number of '1' bits it has (also known as the Hamming weight).
 *  
 *
 * @author niallcampbell
 */
public class NumberOfOneBits {
    
    public static int hammingWeight(int n) {
        
        String bin = Integer.toBinaryString(n);
        
        int sum = 0;
        
        for(int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1') {
                sum++;
            }
        }
        
        return sum;
    }
    
}
