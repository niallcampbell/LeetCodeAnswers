package com.niall.interviewqs;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * @author niallcampbell
 */

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {
    
    private final List<Integer> stack;
    private int minValue;

    public MinStack() {
        stack = new ArrayList<>();
        minValue = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < minValue) minValue = val;
        stack.add(val);
    }
    
    public void pop() {
        int val = stack.remove(stack.size() - 1);
        if(val == minValue) {
            minValue = Integer.MAX_VALUE;
            for(int i : stack) {
                if(i <= minValue) minValue = i;
            }
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);      
    }
    
    public int getMin() {
        return minValue;
    }
    
}
