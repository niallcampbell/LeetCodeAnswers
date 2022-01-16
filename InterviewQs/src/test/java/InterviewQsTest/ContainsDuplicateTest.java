package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.ContainsDuplicate.containsDuplicate;


public class ContainsDuplicateTest {
    
    @Test
    public void GIVEN_arrayWithDuplicates_THEN_returnTrue() {
        int[] nums = {1,2,3,1};
        assertTrue(containsDuplicate(nums));
    }
    
    @Test
    public void GIVEN_arrayWithoutDuplicates_THEN_returnFalse() {
        int[] nums = {1,2,3,4};
        assertFalse(containsDuplicate(nums));
    }
    
}
