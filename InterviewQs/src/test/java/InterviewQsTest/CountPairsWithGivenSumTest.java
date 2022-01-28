package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.CountPairsWithGivenSum.countPairs;

public class CountPairsWithGivenSumTest {
    
    @Test
    public void GIVEN_arrayAndSum_THEN_returnNumberOfPairs() {
        
        int [] nums1 = {1, 5, 7, -1, 5};
        int sum = 6;
        int answer = 3;
        assertEquals(countPairs(nums1, sum), answer);
        
        int [] nums2 = {1, 3, 4, -6, 3, 10};
        sum = 4;
        answer = 3;
        assertEquals(countPairs(nums2, sum), answer);
    }
    
}
