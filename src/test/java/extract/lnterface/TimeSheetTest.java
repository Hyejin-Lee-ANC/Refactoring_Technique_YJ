package extract.lnterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetTest {
    private TimeSheet timeSheet = new TimeSheet();
    private Employee normalEmployee = new Employee(100, false);
    private Employee specialSkilledEmployee = new Employee(100, true);

    @Test
    public void testNormalEmployeeCharge() {
        assertEquals(1000, timeSheet.charge(normalEmployee, 10));
    }

    @Test
    public void testSpecialSkilledEmployeeCharge() {
        assertEquals(1050, timeSheet.charge(specialSkilledEmployee, 10));
    }
}