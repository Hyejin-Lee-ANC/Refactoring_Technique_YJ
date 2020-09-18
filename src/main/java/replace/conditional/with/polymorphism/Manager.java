package replace.conditional.with.polymorphism;

class Manager extends EmployeeType {
    @Override public int getTypeCode() {
        return MANAGER;
    }
}