package consolidate.duplicate.conditional.fragments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TellerTest {
    @Test
    public void testTotalPrice() {
        Teller teller = new Teller();
        teller.price = 1000;
        teller.sendEmailPromotion();
        assertEquals(980, teller.total);
    }

    @Test
    public void testTotalPrice_specialDeal() {
        Teller teller = new Teller();
        teller.price = 1000;
        teller.isSpecialDeal = true;
        teller.sendEmailPromotion();
        assertEquals(950, teller.total);
    }
}