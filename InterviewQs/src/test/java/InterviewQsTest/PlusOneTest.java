package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.PlusOne.*;

public class PlusOneTest {
    
    @Test
    public void GIVEN_array_THEN_returnArrayPlusOne() {
        int[] digits = {1, 2, 3};
        int[] result = {1, 2, 4};
        assertArrayEquals(plusOne(digits), result);
        
        digits = new int[]{9, 0, 8, 9, 3, 9, 7, 9};
        result = new int[]{9, 0, 8, 9, 3, 9, 8, 0};
        assertArrayEquals(plusOne(digits), result);
        
        digits = new int[]{9, 9, 9};
        result = new int[]{1, 0, 0, 0};
        assertArrayEquals(plusOne(digits), result);
    }
    
    @Test
    public void GIVEN_array_THEN_returnArrayPlusOneAlt() {
        int[] digits = {1, 2, 3};
        int[] result = {1, 2, 4};
        assertArrayEquals(plusOneAlt(digits), result);
        
        digits = new int[]{9, 0, 8, 9, 3, 9, 7, 9};
        result = new int[]{9, 0, 8, 9, 3, 9, 8, 0};
        assertArrayEquals(plusOneAlt(digits), result);
        
        digits = new int[]{9, 9, 9};
        result = new int[]{1, 0, 0, 0};
        assertArrayEquals(plusOneAlt(digits), result);
    }
    
}
