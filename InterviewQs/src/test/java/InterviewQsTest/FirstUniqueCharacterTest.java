package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.FirstUniqueCharacter.firstUniqChar;

public class FirstUniqueCharacterTest {
    
    @Test
    public void GIVEN_string_THEN_returnIndexOfFirstUniqueChar() {
        assertEquals(firstUniqChar("hhello"), 2);
    }
    
    @Test
    public void GIVEN_stringWithNoUniqueChar_THEN_returnMinusOne() {
        assertEquals(firstUniqChar("aabb"), -1);
    }
    
}
