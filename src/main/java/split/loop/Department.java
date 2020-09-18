package split.loop;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees = new ArrayList<>();

    public String printInfo() {
        double totalSalary = 0;
        double averageAge = 0;

        for (Employee e : employees) {
            averageAge += e.age;
            totalSalary += e.salary;
        }
        averageAge /= employees.size();
        return "Average age=" + averageAge + ", Total salary=" + totalSalary;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }
}
