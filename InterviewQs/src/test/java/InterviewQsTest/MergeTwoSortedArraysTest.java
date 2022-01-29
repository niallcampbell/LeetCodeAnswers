package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.MergeTwoSortedArrays.*;

public class MergeTwoSortedArraysTest {
    
    @Test
    public void GIVEN_twoSortedArrays_THEN_returnMergedArray() {
        
        int[] a = {1,4,6,7};
        int[] b = {2,5,6,8};
        int[] c = {1,2,4,5,6,6,7,8};
        assertArrayEquals(mergeTwoSortedArrays(a, b), c);
        
        a = new int[]{1,2,3};
        b = new int[]{2,3,4,5,6};
        c = new int[]{1,2,2,3,3,4,5,6};
        assertArrayEquals(mergeTwoSortedArrays(a, b), c);
        
    }
    
}
