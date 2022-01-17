package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.SingleNumber.*;

public class SingleNumberTest {
    
    @Test
    public void GIVEN_array_THEN_returnSingleNumber() {
        int[] nums1 = {2,2,1};
        assertEquals(singleNumber(nums1), 1);
        
        int[] nums2 = {4,1,2,1,2};
        assertEquals(singleNumber(nums2), 4);
        
        int[] nums3 = {1};
        assertEquals(singleNumber(nums3), 1);
    }
    
}
