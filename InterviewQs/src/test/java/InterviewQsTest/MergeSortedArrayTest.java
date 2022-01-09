package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.MergeSortedArray.mergeSortedArrays;

public class MergeSortedArrayTest {
    
    @Test
    public void GIVEN_twoArrays_THEN_arraysMergedSuccessfully() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        int[] output = new int[]{1, 2, 2, 3, 5, 6};
        assertArrayEquals(mergeSortedArrays(nums1, m, nums2, n), output);
    }
    
}
