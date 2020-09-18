package replace.delegation.with.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void testToString() {
        Employee e = new Employee();
        e.setName("Robert Martin");
        assertEquals("Emp: Martin", e.toString());
    }
}