package consolidate.conditional.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayoutTest {
    @Test
    public void testPayout() {
        Payout p = new Payout();
        p.seniority = 3;
        p.monthsDisabled = 6;
        assertEquals(5, p.disabilityAmount());
    }

    @Test
    public void testPayout_seniority_lessThan_2() {
        Payout p = new Payout();
        p.seniority = 1;
        assertEquals(0, p.disabilityAmount());
    }

    @Test
    public void testPayout_seniority_monthsDisabled_greaterThan_12() {
        Payout p = new Payout();
        p.seniority = 3;
        p.monthsDisabled = 13;
        assertEquals(0, p.disabilityAmount());
    }

    @Test
    public void testPayout_seniority_partTime() {
        Payout p = new Payout();
        p.seniority = 3;
        p.monthsDisabled = 6;
        p.isPartTime = true;
        assertEquals(0, p.disabilityAmount());
    }
}