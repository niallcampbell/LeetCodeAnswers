package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.niall.interviewqs.MinStack;

public class MinStackTest {
    
    @Test
    public void GIVEN_stack_THEN_returnMinElement() {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(4);
        obj.push(6);
        obj.push(3);
        obj.push(7);
        obj.pop();
        obj.pop();
        assertEquals(4, obj.getMin());
        
    }
    
}
