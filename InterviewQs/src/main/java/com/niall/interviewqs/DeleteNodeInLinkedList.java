package com.niall.interviewqs;

/**
 * Write a function to delete a node in a singly-linked list. 
 * 
 * You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
 * 
 * Example:
 * 
 * Input: head = [4,5,1,9], node = 5, Output: [4,1,9]
 * 
 * Input: head = [4,5,1,9], node = 1, Output: [4,5,9]
 *
 * @author niallcampbell
 */
public class DeleteNodeInLinkedList {
    
    /**
     * Copy the contents of the nodes. 
     * Delete the last node. 
     * 
     * @param node 
     */
    public static void deleteNode(LinkNode node) {
        
        LinkNode current = node;
        LinkNode next = current.next;
        LinkNode prev = null;
        
        while(next != null) {
            current.val = next.val;
            prev = current;
            current = next;
            next = next.next;
        }
        
        prev.next = null;
    }
    
}
