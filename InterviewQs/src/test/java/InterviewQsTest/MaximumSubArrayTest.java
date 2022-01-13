package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.MaximumSubArray.maxSubArray;

public class MaximumSubArrayTest {
    
    @Test
    public void GIVEN_array_THEN_return_maxSubArraySum() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int output = 6;
        
        // note: largest sub-array is {4, -1, 2, 1}
        
        assertEquals(maxSubArray(nums), output);
    }
    
    @Test
    public void GIVEN_allNegativeArray_THEN_return_maxSubArraySum() {
        int[] nums = {-2, -1, -3, -5};
        int output = -1;
        assertEquals(maxSubArray(nums), output);
    }
    
}
