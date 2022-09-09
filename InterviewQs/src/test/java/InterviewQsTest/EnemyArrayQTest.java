package InterviewQsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.niall.interviewqs.EnemyArrayQ.arrayChallenge;

public class EnemyArrayQTest {
    
    @Test
    public void GIVEN_arr_THEN_returnClosestEnemy1() {
        int[] arr = {0, 0, 1, 0, 0, 2, 0, 2};
        assertEquals(arrayChallenge(arr), 3);
    }
    
    @Test
    public void GIVEN_arr_THEN_returnClosestEnemy2() {
        int[] arr = {2, 0, 1, 0, 0, 2, 0, 2};
        assertEquals(arrayChallenge(arr), 2);
    }
    
    @Test
    public void GIVEN_arrWithNoEnemies_THEN_returnZero() {
        int[] arr = {0, 0, 1, 0, 0};
        assertEquals(arrayChallenge(arr), 0);
    }
    
    
}
