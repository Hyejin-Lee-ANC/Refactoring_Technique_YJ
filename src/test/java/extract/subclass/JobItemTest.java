package extract.subclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobItemTest {

    @Test
    public void testJobItemTotalPrice() {
        // Somewhere in client code
        JobItem j = new JobItem(15, 10, false, null);
        assertEquals(150, j.getTotalPrice());
    }

    @Test
    public void testLaborTotalPrice() {
        // Somewhere in client code
        Employee kent = new Employee(50);
        JobItem j = new JobItem(5, 0, true, kent);
        assertEquals(250, j.getTotalPrice());
    }
}