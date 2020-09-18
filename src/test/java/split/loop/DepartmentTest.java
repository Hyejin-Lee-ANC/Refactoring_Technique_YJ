package split.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    @Test
    public void testPrintInfo() {
        Department d = new Department();
        d.addEmployee(new Employee(30, 100000));
        d.addEmployee(new Employee(31, 80000));
        double expectedAverageAge = 30.5;
        double expectedTotalSalary = 180000;
        assertEquals("Average age=" + expectedAverageAge + ", Total salary=" + expectedTotalSalary, d.printInfo());
    }
}