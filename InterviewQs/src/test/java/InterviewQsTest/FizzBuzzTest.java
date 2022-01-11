package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

import static com.niall.interviewqs.FizzBuzz.fizzBuzz;

public class FizzBuzzTest {
    
    @Test
    public void GIVEN_n_THEN_returnFizzBuzzList() {
        int n1 = 3;
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("Fizz");
        assertEquals(fizzBuzz(n1), list1);
        
        int n2 = 5;
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("Fizz");
        list2.add("4");
        list2.add("Buzz");
        assertEquals(fizzBuzz(n2), list2);
    }
    
}
