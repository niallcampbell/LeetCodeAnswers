package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.niall.interviewqs.LinkNode;
import static com.niall.interviewqs.LinkedListPalindrome.*;

public class LinkedListPalindromeTest {
    
    // Approach 1 tests
    
    @Test
    public void GIVEN_palindromeLinkedList_WITH_approach1_THEN_returnTrue() {
        
        LinkNode head = new LinkNode(1);
        LinkNode n1 = new LinkNode(2);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(1);
        
        n2.next = n3;
        n1.next = n2;
        head.next = n1;
        
        assertTrue(isPalindromeApproach1(head));
    }
    
    @Test
    public void GIVEN_nonPalindromeLinkedList_WITH_approach1_THEN_returnFalse() {
        
        LinkNode head = new LinkNode(1);
        LinkNode n1 = new LinkNode(2);
        
        head.next = n1;
        
        assertFalse(isPalindromeApproach1(head));
    }
    
    
    // Approach 2 tests
    
    
    @Test
    public void GIVEN_palindromeLinkedList_WITH_approach2_THEN_returnTrue() {
        
        LinkNode head = new LinkNode(1);
        LinkNode n1 = new LinkNode(2);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(1);
        
        n2.next = n3;
        n1.next = n2;
        head.next = n1;
        
        assertTrue(isPalindromeApproach2(head));
    }
    
    @Test
    public void GIVEN_nonPalindromeLinkedList_WITH_approach2_THEN_returnFalse() {
        
        LinkNode head = new LinkNode(1);
        LinkNode n1 = new LinkNode(2);
        
        head.next = n1;
        
        assertFalse(isPalindromeApproach2(head));
    }
}
