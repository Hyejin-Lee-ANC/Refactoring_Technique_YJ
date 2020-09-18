package move.field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testInterestForAmount() {
        Account a = new Account();
        a.setInterestRate(0.02);
        assertEquals(0.547945205479452, a.interestForAmount_days(1000, 10));
    }
}