package com.niall.interviewqs;

import java.util.ArrayList;

/**
 *  
 *  Return an array of the odd numbers that are in order in an array. 
 * 
 *
 * @author niallcampbell
 */
public class SortedOddNumbers {
    
    public static int[] getSortedOddNumbers(int[] array) {
        
        ArrayList<Integer> inOrderOddNumbers = new ArrayList<>();
        
        int current = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 && array[i] > current) {
                inOrderOddNumbers.add(array[i]);
                current = array[i];
            }
        }
        
        int[] array2 = new int[inOrderOddNumbers.size()];
        
        for(int i = 0; i < inOrderOddNumbers.size(); i++) {
            array2[i] = inOrderOddNumbers.get(i);
        }
        
        return array2;
    }
    
}
