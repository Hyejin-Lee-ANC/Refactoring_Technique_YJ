package move.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    public void setUp() {
        createDefaultAccount();
    }

    @Test
    public void testBackCharge() {
        assertEquals(4.5, account.bankCharge());
    }

    @Test
    public void testBackCharge_dayOverdrawn() {
        setDaysOverdrawn(1);
        assertEquals(6.25, account.bankCharge());
    }

    @Test
    public void testBackCharge_dayOverdrawn_greaterThan_week() {
        setDaysOverdrawn(10);
        assertEquals(22.0, account.bankCharge());
    }

    @Test
    public void testBackCharge_premium() {
        setPremiumType();
        assertEquals(4.5, account.bankCharge());
    }

    @Test
    public void testBackCharge_dayOverdrawn_premium() {
        setPremiumType();
        setDaysOverdrawn(1);
        assertEquals(14.5, account.bankCharge());
    }

    @Test
    public void testBackCharge_dayOverdrawn_greaterThan_week_premium() {
        setPremiumType();
        setDaysOverdrawn(10);
        assertEquals(17.05, account.bankCharge());
    }

    private void setDaysOverdrawn(int i) {
        account.setDaysOverdrawn(i);
    }


    private void createDefaultAccount() {
        account = new Account();
        account.setType(new AccountType(false));
    }

    private void setPremiumType() {
        account.setType(new AccountType(true));
    }
}