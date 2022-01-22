package com.niall.interviewqs;

/**
 *  Reverse Integer Q
 * 
 *  Given a signed 32-bit integer x, return x with its digits reversed. 
 * 
 *  If reversing x causes the value to go outside the 
 *      signed 32-bit integer range [-231, 231 - 1], then return 0.
 * 
 *  Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *      i.e. you cannot use a bigger primitive such as a long. 
 *
 * @author niallcampbell
 */
public class ReverseInteger {
    
    /**
     *  Approach:
     * 
     *  Reverse x. 
     * 
     *  When reversing, if adding the new digit to y causes it to overflow (and become a completely different number), 
     *      then this means that y/10 no longer be equal to the prev value of y. 
     *  
     * 
     * @param x
     * @return 
     */
    public static int reverse(int x) {
        
        boolean minus = false;
        if(x < 0) {
            minus = true;
            x = -x;
        }
        
        int y = 0;
        int digit = 0;
        int prev = 0;
        
        while(x > 0) {
            digit = x % 10;
            x = x /10;
            prev = y;
            y = (y * 10) + digit;
            
            if((y / 10) != prev) return 0;
        }
        
        if(minus) y = -y;
        
        return y;
    }
    
}
