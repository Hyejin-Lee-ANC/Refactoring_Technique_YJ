package preserve.whole.object;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeatingPlanTest {
    private HeatingPlan heatingPlan;
    private Room room;

    @BeforeEach
    public void setUp() {
        heatingPlan = new HeatingPlan();
        room = new Room();
    }

    @Test
    public void testHeatingRange_lower() {
        heatingPlan.setTempRange(20, 25);
        room.setTempRange(18, 22);
        assertFalse(room.withinPlan(heatingPlan));
    }

    @Test
    public void testHeatingRange_higher() {
        heatingPlan.setTempRange(20, 25);
        room.setTempRange(22, 27);
        assertFalse(room.withinPlan(heatingPlan));
    }

    @Test
    public void testHeatingRange_lower_higher() {
        heatingPlan.setTempRange(20, 25);
        room.setTempRange(18, 27);
        assertFalse(room.withinPlan(heatingPlan));
    }

    @Test
    public void testHeatingRange_within() {
        heatingPlan.setTempRange(20, 25);
        room.setTempRange(22, 23);
        assertTrue(room.withinPlan(heatingPlan));
    }
}