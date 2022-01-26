package com.niall.interviewqs;

/**
 *
 * @author niallcampbell
 */
public class LongestPalindromicSubString {
    
    public static String longestPalindrome(String s) {
        
        int l = s.length();
        
        int max = 0;
        int curr = 0;
        String ss = "";
        
        for(int i = 0; i < l; i++) {
            for(int j = i; j < l; j++) {
                if(isPalindrome(s.substring(i, j + 1))) {
                    curr = s.substring(i, j + 1).length();
                    if(curr > max) {
                        max = curr;
                        ss = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ss;
    }
    
    private static boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
    }
    
    public static void main(String [] args) {
        System.out.println(longestPalindrome("babsc"));
    }
}

