package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.TwoSum.twoSum;

public class TwoSumTest {
    
    @Test
    public void GIVEN_arrayAndTarget_THEN_returnIndicesSuccessfully() {
        final int[] array = {2, 7, 11, 15};
        final int target = 9;
        final int[] answer = {1, 0};
        assertArrayEquals(twoSum(array, target), answer);
    }
    
    @Test
    public void GIVEN_arrayWithDuplicatesAndTarget_THEN_returnIndicesSuccessfully2() {
        final int[] array = {3, 2, 3};
        final int target = 6;
        final int[] answer = {2, 0};
        assertArrayEquals(twoSum(array, target), answer);
    }
    
    @Test
    public void GIVEN_nullArray_THEN_returnNull() {
        assertEquals(twoSum(null, 0), null);
    }
    
    @Test
    public void GIVEN_emptyArray_THEN_returnNull() {
        int[] array = {};
        assertEquals(twoSum(array, 0), null);
    }
    
}
