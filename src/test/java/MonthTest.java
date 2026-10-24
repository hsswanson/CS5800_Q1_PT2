import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonthTest {
    Month month;
    @Test
    public void testHas31Days(){
        month = Month.JANUANRY;
        assertTrue(month.has31Days());


    }
}
