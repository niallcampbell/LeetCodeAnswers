package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.niall.interviewqs.ValidParentheses.isValidParentheses;

public class ValidParenthesesTest {
    
    @Test
    public void GIVEN_validParentheses_THEN_returnTrue() {
        
        String s1 = "()";
        assertTrue(isValidParentheses(s1));
        
        String s2 = "()[]{}";
        assertTrue(isValidParentheses(s2));
        
        String s3 = "({[]})";
        assertTrue(isValidParentheses(s3));
    }
    
    @Test
    public void GIVEN_invalidParentheses_THEN_returnFalse() {
        
        String s1 = "{)";
        assertFalse(isValidParentheses(s1));
        
        String s2 = "]";
        assertFalse(isValidParentheses(s2));
        
        String s3 = "{";
        assertFalse(isValidParentheses(s3));
    }
    
    @Test
    public void GIVEN_nullString_THEN_returnFalse() {
        String s = null;
        assertFalse(isValidParentheses(s));
    }
    
    @Test
    public void GIVEN_emptyString_THEN_returnFalse() {
        String s = "";
        assertFalse(isValidParentheses(s));
    }
    
}
