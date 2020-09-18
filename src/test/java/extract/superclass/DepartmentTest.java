package extract.superclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartmentTest {
    @Test
    public void testTotalAnnualCost() {
        Department d = createDepartment("SELC");
        addStaff(d, new Employee("Johnny", "10141232", 100000));
        addStaff(d, new Employee("HyunTae", "04731923", 150000));
        addStaff(d, new Employee("JinWoo", "99182734", 180000));

        assertEquals(430000, d.getTotalAnnualCost());
    }

    private void addStaff(Department d, Employee employee) {
        d.addStaff(employee);
    }

    private Department createDepartment(String name) {
        return new Department(name);
    }
}