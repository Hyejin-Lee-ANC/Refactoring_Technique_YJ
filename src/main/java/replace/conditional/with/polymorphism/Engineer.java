package replace.conditional.with.polymorphism;

class Engineer extends EmployeeType {
    @Override public int getTypeCode() {
        return ENGINEER;
    }
}
