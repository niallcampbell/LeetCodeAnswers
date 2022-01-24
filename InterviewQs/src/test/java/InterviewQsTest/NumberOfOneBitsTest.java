package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.NumberOfOneBits.*;

public class NumberOfOneBitsTest {
    
    @Test
    public void GIVEN_integer_THEN_returnTheNumberOfOneBits() {
        
        assertEquals(hammingWeight(00000000000000000000000000001011), 3);
        
    }
    
}
