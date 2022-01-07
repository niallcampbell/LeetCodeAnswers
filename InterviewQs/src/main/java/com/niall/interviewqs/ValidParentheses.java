package com.niall.interviewqs;

import java.util.Stack;

/**
 *  Valid parentheses question.
 * 
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 *      determine if the input string is valid.
 * 
 *  An input string is valid if:
 *      Open brackets must be closed by the same type of brackets.
 *      Open brackets must be closed in the correct order.
 *
 *  @author niallcampbell
 */
public class ValidParentheses {
    
    /**
     *  Approach:
     * 
     *  For each character in the String:
     *      if it is (, {, or [, push it on to the stack.
     *      if it is ), }, or ], pop it the value from the stack and check if it corresponds.
     *      if the stack is empty and ), }, or ] is being pushed, then this is not valid as it cannot be balanced. 
     * 
     * @param s
     * @return 
     */
    public static boolean isValidParentheses(final String s) {
        
        if(s == null || s.length() == 0) return false;
        
        Stack stack = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            
            if(c1 == '(' || c1 == '{' || c1 == '[') {
                stack.push(c1);
            } else if(stack.empty()) {
                return false;
            } else {
                char c2 = (Character)stack.pop();
                
                if((c1 == ')' && !(c2 == '(')) || (c1 == '}' && !(c2 == '{'))
                        || (c1 == ']' && !(c2 == '['))) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
