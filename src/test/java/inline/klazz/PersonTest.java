package inline.klazz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testTelephoneNumber() {
        Person emergencyAgent = new Person();
        emergencyAgent.getOfficeTelephone().setAreaCode("031");
        emergencyAgent.getOfficeTelephone().setNumber("8031-3119");
        assertEquals("(031) 8031-3119", emergencyAgent.getTelephoneNumber());
    }
}