package replace.conditional.with.polymorphism;

class Employee {
    private EmployeeType type;
    public int monthlySalary;
    public int commission;
    public int bonus;

    public int payAmount() {
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee Code");
        }
    }

    public int getTypeCode() {
        return type.getTypeCode();
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
}
