package com.niall.interviewqs;

/**
 *  Return the factorial of a given number.
 * 
 *  The factorial is the number itself multiplied by all of its preceding numbers greater than 0. 
 *  
 *
 * @author niallcampbell
 */
public class Factorial {
    
    public static int factorial(int n) {
        
        if(n == 1) {
            return n;
        }
        
        return n * factorial(n - 1);
        
    }
    
}
