package InterviewQsTest;

import static com.niall.interviewqs.HappyNumber.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    
    @Test
    public void GIVEN_happyNumber_THEN_returnTrue() {
        assertTrue(isHappy(19));
        assertTrue(isHappyAlt(19));
    }
    
    @Test
    public void GIVEN_nonHappyNumber_THEN_returnFalse() {
        assertFalse(isHappy(2));
        assertFalse(isHappyAlt(2));
    }
    
}
