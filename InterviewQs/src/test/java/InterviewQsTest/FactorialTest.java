package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.Factorial.factorial;

public class FactorialTest {
    
    @Test
    public void GIVEN_number_THEN_returnFactorial() {
        assertEquals(factorial(3), 6);
        assertEquals(factorial(4), 24);
    }
    
}
