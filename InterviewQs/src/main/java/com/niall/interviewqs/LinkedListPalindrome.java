package com.niall.interviewqs;

import java.util.Stack;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * @author niallcampbell
 */
public class LinkedListPalindrome {
    
    /**
     * Add the values of the LinkedList to a String. 
     * Check if the String is a palindrome.
     *
     * @param head
     * @return boolean
     */
    public static boolean isPalindromeApproach1(LinkNode head) {
        
        if(head == null) return false;
        if(head.next == null) return true;
        
        String s = "";
        LinkNode l = head;
        
        while(l != null) {
            s = s + l.val;
            l = l.next;
        }
        
        return checkIfStringIsPalindrome(s);
        
    }
    
    public static boolean checkIfStringIsPalindrome(String s) {
        
        if(s == null || s.length() == 0) {
            return false;
        }
        
        int i = 0, j = s.length() -1;
        
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        
        return true;
    }
    
    /**
     * Add the elements of the LinkedList to a Stack.
     * Popping the elements of the stack will pop them in reverse order.
     * Compare the elements of the LinkedList to the popped elements.
     * 
     * @param head
     * @return 
     */
    public static boolean isPalindromeApproach2(LinkNode head) {
        
        if(head == null) return false;
        if(head.next == null) return true;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        LinkNode temp = head;
        
        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp != null) {
            if(temp.val != (int) stack.pop()) {
                return false;
            } else {
                temp = temp.next;
            }
        }
        
        return true;
    }
    
}
