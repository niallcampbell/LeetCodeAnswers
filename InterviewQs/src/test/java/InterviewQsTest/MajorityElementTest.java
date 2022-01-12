package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.MajorityElement.getMajorityElement;

public class MajorityElementTest {
    
    @Test
    public void GIVEN_array_THEN_returnMajorityElement() {
        int[] nums = {3, 2, 3};
        int output = 3;
        assertEquals(getMajorityElement(nums), output);
        
        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        output = 2;
        assertEquals(getMajorityElement(nums), output);
    }
    
}
