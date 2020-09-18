package hide.delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testGetManager() {
        Person sally = new Person();
        Department frameworkDept = new Department(sally);

        Person johnny = new Person();
        johnny.setDepartment(frameworkDept);

        Person manager = johnny.getDepartment().getManager();
        assertEquals(sally, manager);
    }
}