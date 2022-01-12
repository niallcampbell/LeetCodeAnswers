package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.NeedleInAHaystack.strStr;

public class NeedleInAHayStackTest {
    
    @Test
    public void GIVEN_needle_THEN_checkIfInHaystack() {
        String haystack = "hello", needle = "ll";
        assertEquals(strStr(haystack, needle), 2);
        
        haystack = "aaaaa";
        needle = "bba";
        assertEquals(strStr(haystack, needle), -1);
        
        haystack = "";
        needle = "";
        assertEquals(strStr(haystack, needle), 0);
    }
    
}
