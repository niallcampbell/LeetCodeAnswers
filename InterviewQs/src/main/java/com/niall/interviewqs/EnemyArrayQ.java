package com.niall.interviewqs;

import java.util.*;

/**
 * 
 * Have the function ArrayChallenge(arr) take the array of numbers stored in arr and from the position in the array where a 1 is, 
 *  return the number of spaces either left or right you must move to reach an enemy which is represented by a 2.
 * 
 *  For example: if arr is [0, 0, 1, 0, 0, 2, 0, 2] then your program should return 3 because 
 *      the closest enemy (2) is 3 spaces away from the 1. 
 * 
 *  The array will contain any number of 0's and 2's, but only a single 1. 
 * 
 *  It may not contain any 2's at all as well, where in that case your program should return a 0.
 *
 * @author niallcampbell
 */
public class EnemyArrayQ {
    
    public static int arrayChallenge(int [] arr) {
        
        int prev2 = -1;
        int next2 = -1;
        int onePosition = -1;
        boolean oneFound = false;
        
        // traverse array from left to right
        // store the position of the most recent 2
        // if you find a one, store its position
        // find the next two
        // return the closest enemy
        
        for(int i = 0; i < arr.length; i++) {
            
            if(oneFound == false) {
                if(arr[i] == 1) {
                    onePosition = i;
                    oneFound = true;
                } else if (arr[i] == 2) {
                    prev2 = i;
                }
            } else {
                if(arr[i] == 2) {
                    next2 = i;
                    break;
                }
            }
        }
        
        if(prev2 == -1 && next2 == -1) return 0;
        else if(prev2 == -1 && next2 != -1) return next2 - onePosition;
        else if(prev2 != -1 && next2 == -1) return onePosition - prev2;
        else return Math.min(onePosition - prev2, next2 - onePosition);
    }
    
}
