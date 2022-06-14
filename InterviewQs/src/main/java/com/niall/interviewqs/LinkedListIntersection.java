package com.niall.interviewqs;

import java.util.Set;
import java.util.HashSet;

/**
 * 
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
 * If the two linked lists have no intersection at all, return null.
 *
 * @author niallcampbell
 */
public class LinkedListIntersection {
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> set = new HashSet<>();
        
        ListNode current = headA;
        while(current != null) {
            set.add(current);
            current = current.next;
        }
        
        current = headB;
        while(current != null) {
            if(set.contains(current)) return current;
            current = current.next;
        }
        
        return null;
        
    }
    
}
