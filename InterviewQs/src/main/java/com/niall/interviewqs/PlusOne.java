package com.niall.interviewqs;

/**
 * 
 *  Plus One Question
 * 
 *  You are given a large integer represented as an integer array digits, 
 *      where each digits[i] is the ith digit of the integer. 
 * 
 *  The digits are ordered from most significant to least significant in left-to-right order. 
 * 
 *  The large integer does not contain any leading 0's.
 * 
 *  Increment the large integer by one and return the resulting array of digits.
 *
 * @author niallcampbell
 */
public class PlusOne {
    
    /**
     *  Original solution.
     * 
     * @param digits
     * @return 
     */
    public static int[] plusOne(int [] digits) {
        
        int n = digits.length - 1;
        
        for(int i = n; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                break;
            } else if(i == 0) {
                digits = addElementToStartOfArray(digits);
                digits[1] = 0;
                digits[0] = 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        return digits;
    }
    
    private static int[] addElementToStartOfArray(int[] digits) {
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 0;
        
        for(int i = 1, j = 0; i < newDigits.length; i++, j++) {
            newDigits[i] = digits[j];
        }
        
        return newDigits;
    }
    
    /**
     * 
     *  More efficient solution. 
     * 
     *  The last part of the code is for when the whole array is 9s. 
     *  It will add one to the start, with the rest of the array being default to 0s. 
     * 
     *  As such, no array copy is required. 
     * 
     * @param digits
     * @return 
     */
    public static int[] plusOneAlt(int[] digits) {
        
        int n = digits.length - 1;
        
        for(int i = n; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    
}
