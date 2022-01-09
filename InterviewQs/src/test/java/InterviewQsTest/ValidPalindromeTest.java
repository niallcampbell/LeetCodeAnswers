package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.niall.interviewqs.ValidPalindrome.*;


public class ValidPalindromeTest {
    
    @Test
    public void GIVEN_validPalindrome_THEN_returnTrue() {
        String validPalindrome = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome1(validPalindrome));
        assertTrue(isPalindrome2(validPalindrome));
        assertTrue(isPalindrome3(validPalindrome));
    }
    
    @Test
    public void GIVEN_invalidPalindrome_THEN_returnFalse() {
        String invalidPalindrome = "race a car";
        assertFalse(isPalindrome1(invalidPalindrome));
        assertFalse(isPalindrome2(invalidPalindrome));
        assertFalse(isPalindrome3(invalidPalindrome));
    }
    
    @Test
    public void GIVEN_stringWithSingleSpace_THEN_returnTrue() {
        String validPalindrome = " ";
        assertTrue(isPalindrome1(validPalindrome));
        assertTrue(isPalindrome2(validPalindrome));
        assertTrue(isPalindrome3(validPalindrome));
    }
    
    @Test
    public void GIVEN_nullString_THEN_returnFalse() {
        String invalidPalindrome = null;
        assertFalse(isPalindrome1(invalidPalindrome));
        assertFalse(isPalindrome2(invalidPalindrome));
        assertFalse(isPalindrome3(invalidPalindrome));
    }
    
}
