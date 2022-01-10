package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.niall.interviewqs.MissingNumber.*;


public class MissingNumberTest {
    
    @Test
    public void GIVEN_array_THEN_returnMissingNumber() {
        int[] nums = {3, 0, 1};
        assertEquals(missingNumber(nums), 2);
        assertEquals(missingNumberAlt(nums), 2);
        
        int[] nums2 = {0, 1};
        assertEquals(missingNumber(nums2), 2);
        assertEquals(missingNumberAlt(nums2), 2);
        
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(missingNumber(nums3), 8);
        assertEquals(missingNumberAlt(nums3), 8);
        
        int[] nums4 = {3, 0, 1, 2};
        assertEquals(missingNumber(nums4), 4);
        assertEquals(missingNumberAlt(nums4), 4);
    }
    
}
