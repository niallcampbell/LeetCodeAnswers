package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.SortedOddNumbers.getSortedOddNumbers;

public class SortedOddNumbersTest {
    
    @Test
    public void GIVEN_array_THEN_returnInOrderOddNumbers() {
        
        int[] array = {3, 1, 4, 5, 8, 7};
        int[] array2 = {3, 5, 7};
        
        assertArrayEquals(getSortedOddNumbers(array), array2);
    }
    
}
