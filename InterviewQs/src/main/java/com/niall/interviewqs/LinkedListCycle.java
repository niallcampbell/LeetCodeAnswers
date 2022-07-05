package com.niall.interviewqs;

import java.util.Set;
import java.util.HashSet;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list 
 *  that can be reached again by continuously following the next pointer.
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * @author niallcampbell
 */
public class LinkedListCycle {
    
    public static boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null) return false;
        
        ListNode current = head;
        
        Set<ListNode> nodesVisited = new HashSet<>();
        
        while(current != null) {
            if(!nodesVisited.add(current)) {
                return true;
            } else {
                current = current.next;
            }
        }
        
        return false;
    }
    
}
