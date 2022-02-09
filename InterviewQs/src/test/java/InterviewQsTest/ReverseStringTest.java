package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.ReverseString.reverseString;

public class ReverseStringTest {
    
    @Test
    public void GIVEN_arrayOfChars_THEN_reverseTheArray() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s1 = {'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(reverseString(s), s1);
    }
    
}
