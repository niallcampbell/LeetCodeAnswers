package com.niall.interviewqs;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * @author niallcampbell
 */
public class ReverseLinkedList {
    
    public static LinkNode reverseLinkedList(LinkNode head) {
        
        if(head == null || head.next == null) return head;
        
        LinkNode current = head;
        LinkNode next = current.next;
        LinkNode prev = null;
        
        while(next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        
        current.next = prev;
        return current;
    }
    
}
