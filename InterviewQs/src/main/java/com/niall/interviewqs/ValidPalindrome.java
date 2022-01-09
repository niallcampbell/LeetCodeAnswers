package com.niall.interviewqs;

/**
 *
 * @author niallcampbell
 */
public class ValidPalindrome {
    
    /**
     *  Approach 1:
     * 
     *  Create a new string and add character if it is a letter or a digit. 
     *  Convert to lowercase.
     *  Check if it is a palindrome.
     *  
     * @param s
     * @return boolean
     */
    public static boolean isPalindrome1(String s) {
        
        if(s == null || s.length() == 0) return false;
        
        String s2 = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                s2 = s2 + s.charAt(i);
            }
        }
        
        s2 = s2.toLowerCase();
        
        int i = 0, j = s2.length() - 1;
        
        while(i < j) {
            if(s2.charAt(i) != s2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    
    /**
     *  Approach 2:
     * 
     *  Find the first & last letter/digit in the String & then compare them. 
     *  If they match, move further into the String. 
     * 
     * @param s
     * @return boolean
     */
    public static boolean isPalindrome2(String s) {
        
        if(s == null || s.length() == 0) return false;
        
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        
        return true;
    }
    
    /**
     *  Approach 3:
     * 
     *  Remove any non-digit/non-letter characters.
     *  Reverse the String & compare them. 
     * 
     * @param s
     * @return boolean
     */
    public static boolean isPalindrome3(String s) {
        
        if(s == null || s.length() == 0) return false;
        
        String s2 = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                s2 = s2 + s.charAt(i);
            }
        }
        
        s2 = s2.toLowerCase();
        
        StringBuilder sb = new StringBuilder(s2);
        String s3 = sb.reverse().toString();
        
        return(s2.equals(s3));
        
    }
    
}
