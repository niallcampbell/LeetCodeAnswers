package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.RomanToInteger.romanToInt;

public class RomanToIntegerTest {
    
    @Test
    public void GIVEN_romanNumeral_THEN_returnIntEquivalentSuccessfully() {
        String s1 = "III";
        assertEquals(romanToInt(s1), 3);
        
        String s2 = "XXVII";
        assertEquals(romanToInt(s2), 27);
        
        String s3 = "XLIX";
        assertEquals(romanToInt(s3), 49);
        
        String s4 = "I";
        assertEquals(romanToInt(s4), 1);
    }
    
    @Test
    public void GIVEN_nullString_THEN_returnMinusOne() {
        assertEquals(romanToInt(null), -1);
    }
    
    @Test
    public void GIVEN_emptyString_THEN_returnMinusOne() {
        assertEquals(romanToInt(""), -1);
    }
    
}
