package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.ReverseInteger.reverse;

public class ReverseIntegerTest {
    
    @Test
    public void GIVEN_integer_THEN_reverseIt() {
        assertEquals(reverse(123), 321);
        assertEquals(reverse(-1234), -4321);
        assertEquals(reverse(120), 21);
    }
    
    @Test
    public void GIVEN_integerThatCausesOverflow_THEN_returnZero() {
        assertEquals(reverse(Integer.MAX_VALUE), 0);
        assertEquals(reverse(Integer.MIN_VALUE), 0);
    }
    
}
