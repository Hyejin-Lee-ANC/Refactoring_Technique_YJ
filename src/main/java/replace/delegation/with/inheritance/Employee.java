package replace.delegation.with.inheritance;

class Employee {
    protected Person person;

    public Employee() {
        this.person = new Person();
    }
    public String getName() {
        return person.getName();
    }
    public void setName(String name) {
        person.setName(name);
    }
    @Override public String toString() {
        return "Emp: " + person.getLastName();
    }
}