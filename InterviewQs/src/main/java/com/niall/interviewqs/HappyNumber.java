package com.niall.interviewqs;

import java.util.HashSet;

/**
 *  Happy number question
 * 
 *  Write an algorithm to determine if a number n is happy.
 * 
 *  A happy number is a number defined by the following process:
 *      - Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *      - Repeat the process until the number equals 1 (where it will stay), 
 *          or it loops endlessly in a cycle which does not include 1.
 *      - Those numbers for which this process ends in 1 are happy.
 *      
 *  Return true if n is a happy number, and false if not.
 *
 * @author niallcampbell
 */
public class HappyNumber {
    
    /**
     *  First approach
     * 
     *  There are only two digits lower than 10 that are happy: 1 & 7
     *  If you get a value lower than 10 that is not either of these, then the original 
     *      number can never be happy. 
     *  Otherwise, put n into an array.
     *  Get the sum of the squares of the digits in the array
     *  Pass this back to isHappy() to see if it eventually equals 1 or 7, 
     *      else repeat getting the sum of its digits. 
     * 
     * @param n
     * @return 
     */
    public static boolean isHappy(int n) {
        
        if(n < 10) {
            if(n == 1 || n == 7) return true;
            else return false;
        }
        
        int[] arr = convertIntToArray(n);
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            sum += (arr[i] * arr[i]);
        }
        
        return isHappy(sum);
    }
    
    private static int[] convertIntToArray(int n) {
        
        String s = "" + n;
        int[] arr = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(s.charAt(i) + "");
        }
        
        return arr;
    }
    
    /**
     *  More efficient approach. 
     * 
     *  If a n eventually equals 1, then it is a happy number. 
     * 
     *  If a number gets stuck in a cycle, 
     *      this means eventually you will hit the same number again at some point. 
     * 
     *  Store the sum of the squares of each value in a HashSet.
     *  If you have to add the same number again, it means you are going in a cycle. 
     *  As such, you will never reach 1 so it is not a happy number. 
     * 
     * @return 
     */
    public static boolean isHappyAlt(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1) {
            n = getNextValue(n);
            if(!set.add(n)) return false;
        }
        
        return true;
    }
    
    private static int getNextValue(int n) {
        int sum = 0;
        int val = 0;
        
        // get the sum of the numbers
        while(n > 0) {
            val = n % 10;
            n = n/10;
            sum += val * val;
        }
        
        return sum;
    }
    
}
