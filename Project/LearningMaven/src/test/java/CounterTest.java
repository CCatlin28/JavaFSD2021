
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    Counter counter;

    @BeforeEach
    public void setup(){
        System.out.println("Before Testing");
        counter = new Counter();
    }

    @Test
    public void testForCounterIncrement(){
        System.out.println("Does the Method Increment the Count?");
        int countValue = counter.increment();
        assertEquals(1, countValue);
    }

    @Test
    public void testForCounterDecrement() {
        System.out.println("Does the Method Decrease the Count?");
        int countValue = counter.decrement();
        assertEquals(-1, countValue);
    }
    @AfterEach
    public void tearDown(){
        System.out.println("After Testing");
        counter = null;
    }
}
