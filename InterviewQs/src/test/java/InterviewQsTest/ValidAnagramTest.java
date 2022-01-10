package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.niall.interviewqs.ValidAnagram.isAnagram;

public class ValidAnagramTest {
    
    @Test
    public void GIVEN_validAnagram_THEN_returnTrue() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(isAnagram(s, t));
    }
    
    @Test
    public void GIVEN_invalidAnagram_THEN_returnFalse() {
        String s = "rat";
        String t = "car";
        assertFalse(isAnagram(s, t));
    }
    
}
