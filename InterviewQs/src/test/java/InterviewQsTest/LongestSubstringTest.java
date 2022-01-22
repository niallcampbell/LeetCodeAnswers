package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.LongestSubstring.lengthOfLongestSubstring;

public class LongestSubstringTest {
    
    @Test
    public void GIVEN_string_THEN_returnLengthOfLongestUniqueSubstring() {
        assertEquals(lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(lengthOfLongestSubstring("dvdf"), 3);
        assertEquals(lengthOfLongestSubstring("au"), 2);
        assertEquals(lengthOfLongestSubstring(" "), 1);   
    }
    
}
