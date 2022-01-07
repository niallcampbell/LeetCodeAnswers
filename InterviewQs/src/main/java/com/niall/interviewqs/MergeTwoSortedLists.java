package com.niall.interviewqs;

/**
 * 
 *  Merge two sorted linked lists. 
 * 
 *  You are given the heads of two sorted linked lists list1 and list2.
 * 
 *  Merge the two lists in a one sorted list. 
 *  The list should be made by splicing together the nodes of the first two lists.
 *
 *  Return the head of the merged linked list.
 * 
 *  Example:
 * 
 *  Input: list1 = [1,2,4], list2 = [1,3,4]
 *  Output: [1,1,2,3,4,4]
 * 
 * @author niallcampbell
 */
public class MergeTwoSortedLists {
    
    /**
     *  Approach:
     * 
     *  For each node in list2, add it in its correct place in list1.
     * 
     * @param list1
     * @param list2
     * @return node
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null & list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;
        
        ListNode prev = null;
        ListNode current = list2;
        
        while(current != null) {
            list1 = addNodeToList(list1, current);
            current = current.next;
        }
        
        return list1;
    }
    
    private static ListNode addNodeToList(ListNode list, ListNode node) {
        
        ListNode insertNode = new ListNode(node.val);
        ListNode prev = null;
        ListNode current = list;
        ListNode head = list;
        
        // insert at head
        if(insertNode.val < current.val) {
            insertNode.next = current;
            return insertNode;
        }
        
        while(current != null) {
            if(current.val > insertNode.val) {
                insertNode.next = current;
                prev.next = insertNode;
                return head;
            } else {
                prev = current;
                current = current.next;
            }
        }
        
        // Insert at end
        prev.next = insertNode;
        return head;
    }
    
}

class ListNode {
    
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}