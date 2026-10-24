import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MonthTest {
    Month month;
    @Test
    public void testHas31Days(){
        month = Month.JANUARY;
        assertTrue(month.has31Days(),"This month should have 31 days.");

        month = Month.MARCH;
        assertTrue(month.has31Days(),"This month should have 31 days.");

        month = Month.APRIL;
        assertFalse(month.has31Days(), "This month should not have 31 days.");

        month = Month.JUNE;
        assertFalse(month.has31Days(), "This month should not have 31 days.");

        month = Month.FEBRUARY;
        assertFalse(month.has31Days(), "This month should not have 31 days.(February)");
    }
}
