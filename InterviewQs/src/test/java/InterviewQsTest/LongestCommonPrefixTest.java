package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.niall.interviewqs.LongestCommonPrefix.getlongestCommonPrefix;
import static com.niall.interviewqs.LongestCommonPrefix.getLongestCommonPrefixAlt;

public class LongestCommonPrefixTest {
    
    @Test
    public void GIVEN_arrayOfWords_THEN_returnLongestCommonPrefix() {
        String[] strs1 = {"flower", "flow", "flight"};
        assertEquals(getlongestCommonPrefix(strs1), "fl");
        assertEquals(getLongestCommonPrefixAlt(strs1), "fl");
        
        String[] strs2 = {"car", "cir"};
        assertEquals(getlongestCommonPrefix(strs2), "c");
        assertEquals(getLongestCommonPrefixAlt(strs2), "c");
    }
    
    @Test
    public void GIVEN_arrayOfWordsWithNoCommonPrefix_THEN_returnEmptyString() {
        String[] strs = {"racecar", "dog", "car"};
        assertEquals(getlongestCommonPrefix(strs), "");
        assertEquals(getLongestCommonPrefixAlt(strs), "");
    }
    
    @Test
    public void GIVEN_null_THEN_returnEmptyString() {
        assertEquals(getlongestCommonPrefix(null), "");
        assertEquals(getLongestCommonPrefixAlt(null), "");
    }
    
    @Test
    public void GIVEN_emptyArray_THEN_returnEmptyString() {
        String[] strs = {};
        assertEquals(getlongestCommonPrefix(strs), "");
        assertEquals(getLongestCommonPrefixAlt(strs), "");
    }
    
    
}
